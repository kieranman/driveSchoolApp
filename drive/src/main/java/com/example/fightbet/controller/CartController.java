package com.example.fightbet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fightbet.model.DrivingPackage;
import com.example.fightbet.model.User;
import com.example.fightbet.payload.request.AddCartDetails;
import com.example.fightbet.service.CartService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/cart")
public class CartController {

	@Autowired
	private CartService cartService;
	
	@PostMapping
	public ResponseEntity<?> saveCartItem(@RequestBody AddCartDetails addCartDetails){
		return cartService.saveCartItem(addCartDetails.getUsername(), addCartDetails.getPackageName());
		
	}
}
