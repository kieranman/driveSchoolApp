package com.example.fightbet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
	
	public ResponseEntity<?> saveCartItem(User user,DrivingPackage drivingPackage){
		ArrayList<DrivingPackage> cartItem = new ArrayList<DrivingPackage>();
		cartItem.add(drivingPackage);
		Cart cart = new Cart(user,cartItem);
		cartRepository.save(cart);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	public Cart getUserCart(User user){

		return null;
		
	}
}
