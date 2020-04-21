package com.marcelo.countries.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.countries.models.User;

@Repository
public interface UserRepo extends CrudRepository<User,Long>{
	
	User findByEmail(String email);
	
	
	@Query("SELECT d FROM User d WHERE id = ?1")
    List<User> getDojoWhereId(Long id);
	

}
