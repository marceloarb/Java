package com.marcelo.EventsBeltReviewer.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.EventsBeltReviewer.models.Event;
import com.marcelo.EventsBeltReviewer.models.User;

@Repository
public interface UserRepo extends CrudRepository<User,Long>{
	User findByEmail(String email);

	Iterable<User> findByEventsNotContains(Event event);
}
