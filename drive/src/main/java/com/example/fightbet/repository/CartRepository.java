package com.example.fightbet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.fightbet.model.Cart;
import com.example.fightbet.model.User;

public interface CartRepository  extends MongoRepository<Cart, String>{
	Cart findByUser(User user);
}
