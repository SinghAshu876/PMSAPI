package com.alkatv.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq", sequenceName = "PMS_APPUSERS_SEQUENCE", initialValue = 2, allocationSize = 1)
public class ApplicationUsers {

	// CREATE MEMORY TABLE PUBLIC.APPLICATION_USERS(ID INTEGER,USERNAME
	// VARCHAR(200),PASSWORD VARCHAR(200), USER_ALIAS VARCHAR(200), USER_GROUP
	// VARCHAR(200),PRIMARY KEY(ID));

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private Integer id;

	@Column(name = "USERNAME", length=200)
	private String userName;

	@Column(name = "PASSWORD", length=200)
	private String password;

	@Column(name = "USER_ALIAS", length=200)
	private String userAlias;

	@Column(name = "USER_GROUP", length=200)
	private String userGroup;

	public Integer getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getUserAlias() {
		return userAlias;
	}

	public String getUserGroup() {
		return userGroup;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserAlias(String userAlias) {
		this.userAlias = userAlias;
	}

	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
	}

}
