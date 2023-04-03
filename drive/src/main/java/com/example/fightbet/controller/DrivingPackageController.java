package com.example.fightbet.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fightbet.model.DrivingPackage;
import com.example.fightbet.payload.request.LoginRequest;
import com.example.fightbet.payload.response.PackageDetails;
import com.example.fightbet.service.DrivingPackageService;

import jakarta.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/package")
public class DrivingPackageController {
	
	@Autowired 
	DrivingPackageService drivingPackageService;
	
	// Admin CRUD operations
	@PostMapping
	public ResponseEntity<?> createPackage(@RequestBody DrivingPackage drivingPackage) {
		
		return drivingPackageService.saveDrivingPackage(drivingPackage);
	}
	
	@GetMapping
	public List<DrivingPackage> findAllPackages(){
		return drivingPackageService.getDrivingPackages();
	}
	
	@GetMapping("{packageName}")
	public DrivingPackage findByPackageName(@PathVariable String packageName) {
		return drivingPackageService.getByPackageName(packageName);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<DrivingPackage> updatePackage(@PathVariable String id , @RequestBody PackageDetails packageDetails){
		return drivingPackageService.updatePackage(id, packageDetails);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Map<String,Boolean>> deletePackage(@PathVariable String id){
		return drivingPackageService.deletePackage(id);
		
	}
		
	

}
