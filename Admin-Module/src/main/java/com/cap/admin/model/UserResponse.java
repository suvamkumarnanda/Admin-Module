package com.cap.admin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
public UserResponse() {
		// TODO Auto-generated constructor stub
	}

private String token;

public UserResponse(String token) {
	super();
	this.token = token;
}

public String getToken() {
	return token;
}

public void setToken(String token) {
	this.token = token;
}

@Override
public String toString() {
	return "UserResponse [token=" + token + "]";
}
}
