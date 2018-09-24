package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.revature.model.Team;
import com.revature.model.User;
import com.revature.repos.TeamRepo;
import com.revature.repos.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo ur;
	
	@Autowired
	private TeamRepo tr;

	public List<User> findAll() {
		return ur.findAll();
	}
	
	public User findOne(int id) {
		User u = ur.getOne(id);
		return u;
	}
	public User updateUserTeams(int id, String[] teamNames) {
		User u = ur.getOne(id);
		System.out.println("Starting with teams" + u.getTeams());
		for (String team : teamNames) {
			Team t = tr.findByName(team);
			System.out.println("Next team" + t);
			u.getTeams().add(t);
			System.out.println("New teams" + u.getTeams());
			ur.saveAndFlush(u);
		}
		return u;
	}
	
	public User login(String username, String password) {
		return ur.findByUsernameAndPassword(username, password);
	}
	public User saveUser(User u) {
		return ur.save(u);
	}
	public List<Team> findByUserId(int id) {
		return ur.findByUserId(id);
	} 
} 
