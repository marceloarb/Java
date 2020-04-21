package com.marcelo.countries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marcelo.countries.service.ApiService;

@Controller
public class MainController {
	
	@Autowired
	private ApiService serv;
	
	
	@RequestMapping("/")
	public String view() {
		
	}
	
}
