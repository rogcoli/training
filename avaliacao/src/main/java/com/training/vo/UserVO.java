package com.training.vo;

import java.util.List;

import com.training.ConverterUtil;

public class UserVO {

	private Long id;

	private String name;

	private String email;

	private List<String> userTypes;

	private String selectedUserType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getUserTypes() {

		if (userTypes == null) {

			userTypes = ConverterUtil.getAllUserTypes();
		}

		return userTypes;
	}

	public void setUserTypes(List<String> userTypes) {
		this.userTypes = userTypes;
	}

	public String getSelectedUserType() {
		return selectedUserType;
	}

	public void setSelectedUserType(String selectedUserType) {
		this.selectedUserType = selectedUserType;
	}

}
