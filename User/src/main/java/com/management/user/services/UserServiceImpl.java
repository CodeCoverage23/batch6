package com.management.user.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.user.Exception.ResourceNotFoundException;
import com.management.user.entity.User;
import com.management.user.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
      @Autowired
	UserRepository userRepository;
	
	
	
	
	@Override
	public User saveUser(User user) {
		String randomUserId = UUID.randomUUID().toString();
		user.setId(randomUserId);
		 return  userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {

		return userRepository.findAll();
	}

	@Override
	public User getUserById(String UserId) {
		// TODO Auto-generated method stub
		return userRepository.findById(UserId).orElseThrow(()->new ResourceNotFoundException("user with gievn id is not found in server "+UserId ));
	}

}
