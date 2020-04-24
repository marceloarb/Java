package com.marcelo.EventsBeltReviewer.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marcelo.EventsBeltReviewer.models.Event;
import com.marcelo.EventsBeltReviewer.models.Message;
import com.marcelo.EventsBeltReviewer.models.User;
import com.marcelo.EventsBeltReviewer.service.Serv;
import com.marcelo.EventsBeltReviewer.validator.UserValidator;

@Controller
public class MainController {
	private final Serv serv;
	private final UserValidator userValidator;
	
	public MainController(Serv serv,UserValidator userValidator) {
		this.serv = serv;
		this.userValidator = userValidator;
	}
	
	
	
	@GetMapping("/")
	public String index(@ModelAttribute("user") User user) {
		return "index.jsp";
	}
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		userValidator.validate(user, result);
		if(result.hasErrors()) {
			return "index.jsp";
		}
		User u = serv.registerUser(user);
		session.setAttribute("userId", u.getId());
		session.setAttribute("userState", u.getState());
		return "redirect:/home";
				
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("email") String email,@ModelAttribute("user") User user, @RequestParam("password") String password, Model model, HttpSession session) {
        boolean isAuthenticated = serv.authenticateUser(email, password);
        if(isAuthenticated) {
        	User u = serv.findByEmail(email);
        	session.setAttribute("userId", u.getId());
        	session.setAttribute("userState", u.getState());
        	return "redirect:/home";
        	
        }
        else {
        	model.addAttribute("error", "Invalid login");
        	return "index.jsp";
        }
        
        
        	
        }
	
	@GetMapping("/home")
	public String dashboard(@ModelAttribute("event") Event event,Model model, HttpSession session) {
		if(session.getAttribute("userId")== null) {
			return "redirect:/";
		}
		User user = serv.findUserById((Long) session.getAttribute("userId"));
		model.addAttribute("userInSession", user);
		System.out.println(user);
		String userState = (String) session.getAttribute("userState");
		System.out.println(userState);
		model.addAttribute("allstate",serv.state_user(userState));
		List<Event> outofstate = new ArrayList<Event>();
		Iterable<Event> allstates = serv.findAll();
		model.addAttribute("outOfStates", outofstate);
		model.addAttribute("userJoinEvent", user.getUser_event());
		System.out.println(user.getEvents());
		for(Event states : allstates) {
			if(states.getState().equalsIgnoreCase(userState)){
				outofstate.add(states);
			}
			
		}
		
		return "event.jsp";
	}
	
	@PostMapping("/event")
	public String event(@Valid @ModelAttribute("event") Event event,BindingResult result,Model model, HttpSession session) {
		if(result.hasErrors()) {
			return "event.jsp";
		}
		Long u = (Long) session.getAttribute("userId");
		User user = serv.findUserById(u);
		event.setUser(user);
		serv.newEvent(event);
		return "redirect:/home";
		
	}
	
	
	@GetMapping("/delete/{id}/event")
	public String destroy(@PathVariable("id") Long id,HttpSession session) {
		if(session.getAttribute("userId")== null) {
			return "redirect:/";
		}
		else {
			serv.delete(id);
			return "redirect:/home";
		}
	}
	
	@GetMapping("/event/{id}/edit")
	public String edit(@PathVariable("id") Long id,Model model) {
		Event event = serv.findEventById(id);
		model.addAttribute("event", event);
		return "edit.jsp";
	}
	
	@PutMapping("/event/{id}")
	public String update(@Valid @ModelAttribute("event") Event event, BindingResult result,HttpSession session) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		else {
		
		serv.newEvent(event);
		return "redirect:/home";
		}
	}
	
	@GetMapping("/event/{id}")
	public String addEventToUser(@PathVariable("id") Long id,HttpSession session,Model model) {
		User user = serv.findUserById((Long) session.getAttribute("userId"));
		Event event = serv.findEventById(id);
		user.getUser_event().add(event);
		serv.update(user);
		return "redirect:/home";
	}
	@GetMapping("/delete/{id}")
	public String cancelEvent(@PathVariable("id") Long id,HttpSession session,Model model) {
		User user = serv.findUserById((Long) session.getAttribute("userId"));
		Event event = serv.findEventById(id);
		user.getUser_event().remove(event);
		serv.update(user);
		return "redirect:/home";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@PostMapping("/message")
	public String message(@Valid @ModelAttribute("message") Message message  ,BindingResult result,HttpSession session,Model model) {
		if(result.hasErrors()) {
			return "message.jsp";
		}
		else{
			Long u = (Long) session.getAttribute("userId");
			User user = serv.findUserById(u);
			message.setUser(user);
			serv.newMessage(message);
			return "redirect:/message";
		}
	}
	
	
	@GetMapping("/message")
	public String viewMessage(@ModelAttribute("message") Message message  ,HttpSession session) {
		if(session.getAttribute("userId")== null) {
			return "redirect:/";
		}
		return "message.jsp";
	}
	
}
