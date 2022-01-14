package com.first.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.first.project1.model.UserModel;
import com.first.project1.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;

	//register user
	@PostMapping("/addUser")
	public ResponseEntity<UserModel> saveUser(@RequestBody UserModel user) {
		return new ResponseEntity<UserModel>(service.save(user),HttpStatus.OK);
	}
}
