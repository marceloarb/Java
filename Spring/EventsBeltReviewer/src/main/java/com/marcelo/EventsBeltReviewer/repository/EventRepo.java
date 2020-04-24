package com.marcelo.EventsBeltReviewer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.EventsBeltReviewer.models.Event;
import com.marcelo.EventsBeltReviewer.models.User;

@Repository
public interface EventRepo extends CrudRepository<Event,Long>{
	
	List<Event> findByState(String state);
	List<Event> findByStateIsNot(String state_user);
	
	

}
