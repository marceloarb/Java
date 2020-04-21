package com.marcelo.DojoOverflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.marcelo.DojoOverflow.service.Serv;

@Controller
public class MainController {
	@Autowired
	private Serv serv;

}
