package com.marcelo.EventsBeltReviewer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.EventsBeltReviewer.models.Message;

@Repository
public interface MessageRepo extends CrudRepository<Message,Long>{
	

}
