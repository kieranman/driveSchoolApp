package com.example.fightbet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.fightbet.model.Role;
import com.example.fightbet.repository.RoleRepository;

@EnableMongoRepositories
@SpringBootApplication
public class DriveApplication implements CommandLineRunner {
	


	public static void main(String[] args) {
		SpringApplication.run(DriveApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}



}
