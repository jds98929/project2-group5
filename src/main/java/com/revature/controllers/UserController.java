package com.revature.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.revature.dto.Credential;
import com.revature.model.User;
import com.revature.services.UserService;

@CrossOrigin(origins = {"http://1808-teamspace.s3-website.us-east-2.amazonaws.com",  "http://localhost:3000"})
@RestController
@JsonIgnoreProperties(ignoreUnknown = true)
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserService us;

	// /users
	@GetMapping
	public List<User> findAll() {
		System.out.println("finding all users");
		return us.findAll();
	}

	// /users/:id
	@GetMapping("{id}")
	public User findById(@PathVariable int id) {
		User user = us.findOne(id);
		return user;
	}
	
	@Transactional
	@PostMapping("/{id}/updateTeams")
	public User newTeam(@PathVariable int id, @RequestBody String[] teamNames) {
		System.out.println(teamNames);
		User u = us.updateUserTeams(id, teamNames);
		return u;
	}

	@PostMapping
	public ResponseEntity<User> save(@RequestBody User u) {
		System.out.println("User is " + u);
		ResponseEntity<User> re = new ResponseEntity<User>(u, HttpStatus.CREATED);
		us.saveUser(u);
		return re;
	}

	@PostMapping("login")
	public User login(@RequestBody Credential u) {

		return us.login(u.getUsername(), u.getPassword());
	}

	@GetMapping("{id}/teams")
	public User findTeamsById(@PathVariable int id) {
		User user = us.findOne(id);
		return user;
	}

}
