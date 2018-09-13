package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.User;
import com.revature.projections.BasicUserProjection;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	BasicUserProjection findByUsernameAndPassword(String username, String password);

	List<User> findByMoviesId(int id);

	List<BasicUserProjection> findAllProjectedBy();
	
	
	

}
