package com.first.project1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.project1.repsitory.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
}
