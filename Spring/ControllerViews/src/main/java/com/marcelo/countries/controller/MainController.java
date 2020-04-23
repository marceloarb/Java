package com.marcelo.countries.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.marcelo.countries.models.User;
import com.marcelo.countries.service.Serv;
import com.marcelo.countries.validator.UserValidator;

@Controller
public class MainController {
	private final UserValidator validator;
	
	public MainController(UserValidator validator) {
		this.validator = validator;
	}
	
	@Autowired
	private Serv serv;
	
	
	
	@RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registration.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "login.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
    	validator.validate(user, result);
    	if(result.hasErrors()) {
    		return "registration.jsp";
    	}
    	User u = serv.registerUser(user);
    	session.setAttribute("userId", u.getId());
    	return "redirect:/home";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        boolean isAuthenticated = serv.authenticateUser(email, password);
        if(isAuthenticated) {
        	User u = serv.findByEmail(email);
        	session.setAttribute("userId", u.getId());
        	return "redirect:/home";
        	
        }
        else {
        	model.addAttribute("error", "Invalid login");
        	return "login.jsp";
        }
        
        
        	
        }
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
    	Long userId = (Long) session.getAttribute("userId");
    		User u = serv.findUserById(userId);
    		model.addAttribute("user", u );
    		return "homepage.jsp";
    }
    
    

}
