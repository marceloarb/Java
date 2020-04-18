package com.marcelo.DojoNinjas.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marcelo.DojoNinjas.models.Dojo;
import com.marcelo.DojoNinjas.models.Ninja;
import com.marcelo.DojoNinjas.service.Serv;

@Controller
public class MainController {
	private final Serv serv;
	
	
	public MainController(Serv serv) {
		this.serv = serv;
	}
	
	
	@RequestMapping("/dojo")
	public String view(@ModelAttribute("dojo") Dojo dojo) {
		return "Dojo.jsp";
	}
	
	@RequestMapping(value="/add/dojo", method=RequestMethod.POST)
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		this.serv.newDojo(dojo);
		return "redirect:/dojo";
	}
	
	
	@RequestMapping("/ninja")
	public String ninja(Model model, @ModelAttribute("ninja") Ninja ninja) {
		List<Dojo> dojo= serv.allDojos();
		model.addAttribute("dojo",dojo);
		return "ninja.jsp";
	}
	
	@RequestMapping(value="/add/ninja", method=RequestMethod.POST)
	public String newNinja(@ModelAttribute("ninja") Ninja ninja) {
		this.serv.newNinja(ninja);
		return "redirect:/ninja";
	}
}
