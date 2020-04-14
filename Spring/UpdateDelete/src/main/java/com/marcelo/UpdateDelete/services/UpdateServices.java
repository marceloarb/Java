package com.marcelo.UpdateDelete.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.sql.Update;
import org.springframework.stereotype.Service;

import com.marcelo.UpdateDelete.repositories.UpdateRepository;

@Service
public class UpdateServices {
	public final UpdateRepository updaterepo;
	public UpdateServices(UpdateRepository updaterepo) {
		this.updaterepo = updaterepo;
	}
	 public List<Update> allUpdate() {
	        return updaterepo.findAll();
	    }
	    // creates a book
	    public Update createUpdate(Update b) {
	        return updaterepo.save(b);
	    }
	    // retrieves a book
	    public Update findUpdate(Long id) {
	        Optional<Update> optionalBook = updaterepo.findById(id);
	        if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
	    } 
}

