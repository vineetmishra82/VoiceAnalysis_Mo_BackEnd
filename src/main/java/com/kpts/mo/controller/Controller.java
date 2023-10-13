package com.kpts.mo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kpts.mo.models.User;
import com.kpts.mo.models.Words;
import com.kpts.mo.service.Service;

@RestController
public class Controller {
	
	@Autowired
	Service service;
	
	@GetMapping("/")
	public String readyToGo()
	{
		return service.readyToGo();
	}
		
	@GetMapping("/allUsers")
	public List<User> getAllUsers()
	{
		return service.getAllUsers();
	}
	
	@GetMapping("/allWords")
	public List<Words> getAllWords()
	{
		return service.getAllWords();
	}
	
	@PostMapping("/newWord")
	public int createNewWord(@RequestParam String word)
	{
		return service.createNewWord(word);
	}
	
	@PostMapping("/newUser")
	public int createNewUser(@RequestParam String mobile,@RequestParam String name)
	{
		return service.createNewUser(mobile,name);
	}

}
