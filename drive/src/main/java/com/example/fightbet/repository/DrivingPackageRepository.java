package com.example.fightbet.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.fightbet.model.DrivingPackage;
import com.example.fightbet.model.User;

public interface DrivingPackageRepository extends MongoRepository<DrivingPackage, String> {
	DrivingPackage findByPackageName(String packageName);

	
}
