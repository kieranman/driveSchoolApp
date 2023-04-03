package com.example.fightbet.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cart")
public class Cart {
	@Id
	private String id;
	
	private User user;
	
	private ArrayList<DrivingPackage> drivingPackage;

	
	
	public Cart(User user, ArrayList<DrivingPackage> drivingPackage) {
		this.user = user;
		this.drivingPackage = drivingPackage;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ArrayList<DrivingPackage> getDrivingPackage() {
		return drivingPackage;
	}

	public void setDrivingPackage(ArrayList<DrivingPackage> drivingPackage) {
		this.drivingPackage = drivingPackage;
	}
	
	
	
	
	
	
}
