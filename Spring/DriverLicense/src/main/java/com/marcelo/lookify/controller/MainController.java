package com.marcelo.lookify.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marcelo.lookify.models.License;
import com.marcelo.lookify.models.Person;
import com.marcelo.lookify.service.Serv;

@Controller
public class MainController {
	private final Serv serv;
	
	public MainController(Serv serv) {
		this.serv = serv;
	}
	@RequestMapping("/")
	public String view() {
		return "index.jsp";
	}
	@RequestMapping("/person")
	public String person(@ModelAttribute("person") Person person) {
		return "person.jsp";
	}
	
	@RequestMapping(value="/add/person", method=RequestMethod.POST)
	public String create(@ModelAttribute("person") Person person) {
		this.serv.createPerson(person);
		return "redirect:/";
	}
	@RequestMapping("/license")
	public String license(Model model, @ModelAttribute("license") License license) {
		List<Person> person = serv.allPeople();
		model.addAttribute("people",person);
		return "license.jsp";
	}
	@RequestMapping(value="/add/license", method=RequestMethod.POST)
	public String createLicense(@ModelAttribute("license") License license) {
		this.serv.createLicense(license);
		return "redirect:/";
	}
	

}
