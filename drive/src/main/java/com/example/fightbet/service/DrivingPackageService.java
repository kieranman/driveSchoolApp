package com.example.fightbet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.fightbet.exception.ResourceNotFoundException;
import com.example.fightbet.model.DrivingPackage;
import com.example.fightbet.payload.response.PackageDetails;
import com.example.fightbet.repository.DrivingPackageRepository;

@Service
public class DrivingPackageService {
	
	@Autowired
	private DrivingPackageRepository drivingPackageRepository;
	
	// Admin CRUD operations
	// Make new package 
	public ResponseEntity<?> saveDrivingPackage(DrivingPackage drivingPackage){
		if((drivingPackage.getPackageName().length() > 0) 
				& (drivingPackage.getDescription().length()>0)
				& (drivingPackage.getPrice()>0)
				) {
			drivingPackageRepository.save(drivingPackage);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	public List<DrivingPackage> getDrivingPackages(){
		return drivingPackageRepository.findAll();
		
	}
	
	public DrivingPackage getByPackageName(String packageName) {
		return drivingPackageRepository.findByPackageName(packageName);
	}
	
	public ResponseEntity<DrivingPackage> updatePackage(String id,PackageDetails packageDetails){
		DrivingPackage drivingPackage = new DrivingPackage();
		drivingPackage = drivingPackageRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Package does not exist with id:"+id));
		drivingPackage.setPackageName(packageDetails.getPackageName());
		drivingPackage.setDescription(packageDetails.getDescription());
		drivingPackage.setPrice(packageDetails.getPrice());
		DrivingPackage updatedPackage = drivingPackageRepository.save(drivingPackage);
		return ResponseEntity.ok(updatedPackage);

		
	}
}


