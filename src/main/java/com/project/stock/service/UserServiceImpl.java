package com.project.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.project.stock.entity.User;
import com.project.stock.repository.UserRepository;

@Service
@Primary
public class UserServiceImpl implements ICrudService<User, Long> {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public void add(User user) {
		userRepository.save(user);
	}

	@Override
	public void update(User user) {
		userRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		User u = new User();
		u.setId(id);
		userRepository.delete(u); 
	}

}
