package com.revature.controllers;

import static org.junit.Assert.*;


import org.junit.*;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class UserControllerTest {
	
	private MockMvc mockMvc;
	private UserController controller;
	
	@Before
	public void setUp() {
		controller = new UserController();
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	public void testNewTeam() {
		fail("Not yet implemented");
	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindTeamsById() {
		fail("Not yet implemented");
	}

}
