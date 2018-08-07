package com.alkatv.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.alkatv.entities.User;
import com.alkatv.repositories.UserRepository;
import com.alkatv.rest.requests.SearchRequest;
import com.alkatv.rest.responses.ResponseType;
import com.alkatv.rest.responses.SearchResponse;

@Service
public class UserService {

	Logger log = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository usersRepository;

	public SearchResponse search(SearchRequest searchRequest) throws Exception {
		log.info("search");

		Optional<User> user = null;
		if (!StringUtils.isEmpty(searchRequest.getId())) {
			user = usersRepository.findById(searchRequest.getId());
		} else if (!StringUtils.isEmpty(searchRequest.getQrNo())) {
			user = usersRepository.findByQrNo(searchRequest.getQrNo());
		} else if (!StringUtils.isEmpty(searchRequest.getMobNumber())) {
			user = usersRepository.findByMobNumber(searchRequest.getMobNumber());
		} else if (!StringUtils.isEmpty(searchRequest.getCustomerName())) {
			user = usersRepository.findByCustomerName(searchRequest.getCustomerName());
		}

		SearchResponse searchResponse = new SearchResponse();
		searchResponse.setResponseType(ResponseType.SUCCESS);
		if (user.isPresent()) {
			searchResponse.addUser(user.get());
		}
		return searchResponse;
	}

}
