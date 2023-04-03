package com.example.fightbet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.fightbet.exception.ResourceNotFoundException;
import com.example.fightbet.model.Cart;
import com.example.fightbet.model.DrivingPackage;
import com.example.fightbet.model.User;
import com.example.fightbet.repository.CartRepository;
import com.example.fightbet.repository.DrivingPackageRepository;
import com.example.fightbet.repository.UserRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private DrivingPackageRepository drivingPackageRepository;
	
	public ResponseEntity<?> saveCartItem(String username,String packageName){
		User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new ResourceNotFoundException("User does not exist with username:"+username));
		
		DrivingPackage drivingPackage = drivingPackageRepository.findByPackageName(packageName);

		
		Cart cart = cartRepository.findByUser(user);

		if(cartRepository.existsByUser(user)) {
			ArrayList<DrivingPackage> cartItems = cart.getDrivingPackage();
			cartItems.add(drivingPackage);
			cart.setDrivingPackage(cartItems);
			cartRepository.save(cart);
			return ResponseEntity.ok(cart);
		}
		else {
			ArrayList<DrivingPackage> cartItems = new ArrayList<DrivingPackage>();
			cartItems.add(drivingPackage);
			Cart newCart = new Cart(user, cartItems);
			cartRepository.save(newCart);
			return ResponseEntity.ok(newCart);
		}
		
		
		
	}
	
	public Cart getUserCart(User user){

		return null;
		
	}
}
