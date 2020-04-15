package com.marcelo.Language.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marcelo.Language.models.Language;
import com.marcelo.Language.service.LanguageService;


@Controller
public class LanguageController {
	private final LanguageService serv;
	
	


	public LanguageController(LanguageService serv) {
		this.serv = serv;
	}
	
	
	@RequestMapping("/")
	public String index(Model model, @ModelAttribute("language") Language language) {
		List<com.marcelo.Language.models.Language> languages = serv.allLanguage();
		model.addAttribute("languages", languages);
		return "index.jsp";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("language") Language x, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		}
		else {
			this.serv.createLanguage(x);
			return "redirect:/";
		}
	}
	@RequestMapping("/language/{id}")
	public String languageId(@PathVariable("id") Long id,Model model) {
		Language language = serv.findLanguage(id);
		model.addAttribute("lang",language);
		return "language.jsp";
	}
	@RequestMapping("/language/{id}/edit")
	public String edit(@PathVariable("id") Long id,Model model) {
		Language language = serv.findLanguage(id);
		model.addAttribute("lang",language);
		return "Edit.jsp";
	}
	@RequestMapping(value="/edit/{id}", method=RequestMethod.PUT)
		public String update(@Valid @ModelAttribute("language") Language lang, BindingResult result) {
			if(result.hasErrors()) {
				return "Edit.jsp";
			}
			else {
				serv.addLanguage(lang);
				return "redirect:/";
			}
		}
	@RequestMapping(value="/language/{id}/delete")
	public String destroy(@PathVariable("id") Long id) {
		serv.delete(id);
		return "redirect:/";
	}
	
	
	
	
}
	
