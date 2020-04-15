package com.marcelo.Language.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marcelo.Language.service.LanguageService;

@Controller
public class MainController {
	private final LanguageService serv;
	
	public MainController(LanguageService serv) {
		this.serv = serv;
	}

	
}
