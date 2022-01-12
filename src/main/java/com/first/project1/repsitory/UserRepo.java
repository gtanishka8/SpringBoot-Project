package com.first.project1.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first.project1.model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel,Integer>{

}
