package com.first.project1.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@Accessors
public class UserModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id", nullable = false)
	private int user_id;
	@Column(name = "user_name", nullable = false)
	private String name;
	@Column(name = "gender")
	private String gender;
	@Column(name = "joining_date")
	private LocalDate doj;
	@Column(name = "karma")
	private int karma;
	public UserModel(int user_id, String name, String gender, LocalDate doj, int karma) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.gender = gender;
		this.doj = doj;
		this.karma = karma;
	}
	public UserModel() {
		super();
	}

	
}
