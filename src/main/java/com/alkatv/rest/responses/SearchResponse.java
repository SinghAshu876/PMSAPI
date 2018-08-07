package com.alkatv.rest.responses;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.alkatv.entities.User;

public class SearchResponse extends APIResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7493510873104292254L;

	private List<User> userList = new ArrayList<>();

	public List<User> getUserList() {
		return userList;
	}

	public void addUser(User user) {
		getUserList().add(user);
	}

	public void addUserList(List<User> userList) {
		if (Objects.nonNull(userList) && !userList.isEmpty()) {
			getUserList().addAll(userList);
		}
	}

}
