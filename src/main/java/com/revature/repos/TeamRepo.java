package com.revature.repos;
import com.revature.model.Team;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeamRepo extends JpaRepository<Team, Integer> {
	
	Team findByName(String name);
}
