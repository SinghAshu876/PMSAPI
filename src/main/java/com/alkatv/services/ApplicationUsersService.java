package com.alkatv.services;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alkatv.entities.ApplicationUsers;
import com.alkatv.exception.AppException;
import com.alkatv.messages.ErrorMessages;
import com.alkatv.messages.UserMessages;
import com.alkatv.repositories.ApplicationUsersRepository;
import com.alkatv.rest.requests.LoginRequest;
import com.alkatv.rest.requests.LogoutRequest;
import com.alkatv.rest.requests.RegistrationRequest;
import com.alkatv.rest.responses.LoginResponse;
import com.alkatv.rest.responses.LogoutResponse;
import com.alkatv.rest.responses.RegistrationResponse;
import com.alkatv.rest.responses.ResponseType;
import com.alkatv.util.UserGroup;

@Service
public class ApplicationUsersService {

	Logger log = LoggerFactory.getLogger(ApplicationUsersService.class);

	@Autowired
	private ApplicationUsersRepository applicationUsersRepository;

	public LoginResponse authenticate(LoginRequest loginRequest) throws Exception {
		log.info("authenticate");
		ApplicationUsers appUsers = applicationUsersRepository.findByUnameAndPwd(loginRequest.getUserName(),
				loginRequest.getPwd());
		if (Objects.isNull(appUsers))
			throw new AppException(ErrorMessages.LOGIN_WRONG_UNAME_PWD);

		LoginResponse loginResponse = new LoginResponse();
		loginResponse.setResponseType(ResponseType.SUCCESS);
		loginResponse.setUserName(appUsers.getUserName());
		loginResponse.setUserAlias(appUsers.getUserAlias());
		loginResponse.setAccessToken("");
		return loginResponse;
	}

	public RegistrationResponse register(RegistrationRequest registrationRequest) throws Exception {

		ApplicationUsers appUsers = applicationUsersRepository.isUnameExists(registrationRequest.getUserName());
		if (Objects.nonNull(appUsers))
			throw new AppException(ErrorMessages.REGISTRATION_UNAME_EXISTS);

		ApplicationUsers applicationUsers = new ApplicationUsers();
		applicationUsers.setPassword(registrationRequest.getPwd());
		applicationUsers.setUserName(registrationRequest.getUserName());
		applicationUsers.setUserAlias(registrationRequest.getName());
		applicationUsers.setUserGroup(UserGroup.GUEST.getDesc());
		applicationUsersRepository.save(applicationUsers);
		RegistrationResponse regResponse = new RegistrationResponse();
		regResponse.setResponseType(ResponseType.SUCCESS);
		regResponse.setMessage(UserMessages.REGISTRATION_SUCCESS);
		return regResponse;
	}

	public LogoutResponse logout(LogoutRequest logoutRequest) throws Exception {
		LogoutResponse logoutResponse = new LogoutResponse();
		logoutResponse.setResponseType(ResponseType.SUCCESS);
		return logoutResponse;

	}
}
