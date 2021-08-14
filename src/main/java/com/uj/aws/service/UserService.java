package com.uj.aws.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uj.aws.entity.User;
import com.uj.aws.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
    
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
}
