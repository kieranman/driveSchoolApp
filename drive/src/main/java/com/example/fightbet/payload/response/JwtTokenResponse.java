package com.example.fightbet.payload.response;

import java.util.List;

public class JwtTokenResponse {

	private String id;
	private String username;
	private String password;
	private String email;
	private List<String> roles;
	private String jwt;
	
	
	JwtTokenResponse(){
		
	}
	
	
	public JwtTokenResponse(String jwt, String id, String username, String email, List<String> roles) {
		this.jwt = jwt;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public String getJwt() {
		return jwt;
	}
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	
	
	
}
