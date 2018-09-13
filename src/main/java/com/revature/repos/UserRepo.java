package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Team;
import com.revature.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	/** User findByUsernameAndPassword(String username, String password);	
	List<Team> findByUserId(int id); */

}
