package com.marcelo.EventsBeltReviewer.service;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelo.EventsBeltReviewer.models.Event;
import com.marcelo.EventsBeltReviewer.models.Message;
import com.marcelo.EventsBeltReviewer.models.User;
import com.marcelo.EventsBeltReviewer.repository.EventRepo;
import com.marcelo.EventsBeltReviewer.repository.MessageRepo;
import com.marcelo.EventsBeltReviewer.repository.UserRepo;

@Service
public class Serv {
	
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private EventRepo eventRepo;
	@Autowired
	private MessageRepo messageRepo;
	
	
	
	public User registerUser(User user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return userRepo.save(user);
	}
	public User update(User user) {
		return userRepo.save(user);
	}
	public Message newMessage(Message message) {
		return messageRepo.save(message);
	}
	public User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }
	public Event newEvent(Event event) {
		return eventRepo.save(event);
	}
	public Iterable<Event> findAll() {
		return eventRepo.findAll();
	}
	public List<Event> state_user(String state_user){
		return eventRepo.findByStateIsNot(state_user);
	}
	
	
	public User findUserById(Long id) {
		User user = userRepo.findById(id).orElse(null);
		if(user == null) {
			return null;
		}
		return user;
    }
	
	public boolean authenticateUser(String email, String password) {
        // first find the user by email
        User user = userRepo.findByEmail(email);
        // if we can't find it by email, return false
        if(user == null) {
            return false;
        } else {
            // if the passwords match, return true, else, return false
            if(BCrypt.checkpw(password, user.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
	public void delete(Long id) {
		eventRepo.deleteById(id);
	}

	public Event findEventById(Long id) {
    	Optional<Event> e = eventRepo.findById(id);
    	
    	if(e.isPresent()) {
            return e.get();
    	} else {
    	    return null;
    	}
	}
	
	
	public Iterable<User> userForEvent(Event event){
		return userRepo.findByEventsNotContains(event);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
