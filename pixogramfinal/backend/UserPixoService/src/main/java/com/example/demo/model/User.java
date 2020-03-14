package com.example.demo.model;

import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

	@Id
	private int id;
	private String fname;
	private String lname;
	private String username;
	private String password;
	private String email;
	private String profilepic;
	public User( ) {
		super();
		Random rand = new Random();
		int resRandom = rand.nextInt((9999 - 100) + 1) + 10;
		this.id = resRandom;
	}
	public User(int id, String fname, String lname, String username, String password, String email, String profilepic) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.profilepic = profilepic;
	}
		
	
}
