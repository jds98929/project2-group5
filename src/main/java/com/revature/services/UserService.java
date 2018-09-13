package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Team;
import com.revature.model.User;
import com.revature.repos.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo ur;

	public List<User> findAll() {
		return ur.findAll();
	}

/**	public User findOne(int id) {
		User u = ur.getOne(id);
		return u;
	}

	public User login(String username, String password) {
		return ur.findByUsernameAndPassword(username, password);
	}

	public List<Team> findByUserId(int id) {
		return ur.findByUserId(id);
	} */
} 
