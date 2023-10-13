package com.kpts.mo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kpts.mo.models.User;
import com.kpts.mo.models.Words;
import com.kpts.mo.repositories.UserRepository;
import com.kpts.mo.repositories.WordsRepository;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	WordsRepository wordsRepository;


	public String readyToGo() {
		return "Localhost -> Controller -> Service -> back";
	}
	
	public List<Words> getAllWords()
	{
		return wordsRepository.findAll();
	}
	
	public List<User> getAllUsers()
	{
		return userRepository.findAll();
	}

	public int createNewWord(String word) {
		
		List<Words> list = wordsRepository.findAll();
		boolean found = false;
		for (Words words : list) {			
			if(words.getWord().equalsIgnoreCase(word))
			{
				found = true;
				return -1;
			}
		}
		
		if(!found)
		{
			Words words = new Words(word);
			wordsRepository.save(words);
			return 1;
		}
		
		return 0;
	}

	public int createNewUser(String mobile, String name) {

		List<User> list = userRepository.findAll();
		boolean found = false;
		for (User user : list) {			
			if(user.getMobileNum().equalsIgnoreCase(mobile))
			{
				found = true;
				return -1;
			}
		}
		
		if(!found)
		{
			User user = new User(mobile, name, 0);
			userRepository.save(user);
			return 1;
		}
		
		return 0;
	}

}


