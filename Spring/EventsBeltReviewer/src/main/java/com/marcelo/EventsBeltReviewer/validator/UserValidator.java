package com.marcelo.EventsBeltReviewer.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.marcelo.EventsBeltReviewer.models.User;
import com.marcelo.EventsBeltReviewer.service.Serv;

@Component
public class UserValidator implements Validator{
	private final Serv serv;
	
	public UserValidator(Serv serv) {
		this.serv = serv;
	}
	@Override
	public boolean supports(Class<?> clazz) {
		
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		if(!user.getPasswordConfirmation().equals(user.getPassword())) {
			errors.rejectValue("passwordConfirmation", "Match");
		}
		
	
	
	
	//Cheking for duplicate emails//
		User checkUser = serv.findByEmail(user.getEmail());
		if(checkUser != null) {
			errors.rejectValue("duplicate", "Duplicate");
		}
		
	}

}
