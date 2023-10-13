package com.kpts.mo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
public class User {
	
	@Id
	private String mobileNum;
	private String userName;
	private int score;
	
	public User() {
	}
	
	

}
