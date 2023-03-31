package com.example.fightbet.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Document(collection = "packages")
public class DrivingPackage {
	@Id
	private String id;

	@NotBlank
	@Size(max = 20)
	private String packageName;

	@NotBlank
	@Email
	private String description;

	@NotBlank
	@Size(max = 120)
	private Integer price;

	public DrivingPackage() {
		
	}
	  
	public DrivingPackage(@NotBlank @Size(max = 20) String packageName, @NotBlank @Email String description, @NotBlank @Size(max = 120) Integer price) {
		this.packageName = packageName;
		this.description = description;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	  
	  
	  
}
