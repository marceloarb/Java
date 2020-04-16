package com.marcelo.lookify.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.marcelo.lookify.models.LookifyModel;
import com.marcelo.lookify.service.LookifyService;

@Controller
public class MainController {
	private final LookifyService serv;
	
	public MainController(LookifyService serv) {
		this.serv = serv;
	}
	
	
	@RequestMapping("/")
	public String view(Model model, @ModelAttribute("song") LookifyModel lookify) {
		List<LookifyModel> song = serv.allSongs();
		model.addAttribute("songs", song);
		return "index.jsp";
	}
	@RequestMapping("/newsong")
	public String newsong(@ModelAttribute("song") LookifyModel song) {
		return "newSong.jsp";
	}
	
	
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("song") LookifyModel song, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		}
		else {
			this.serv.createSong(song);
			return "redirect:/";
		}
	}
	@RequestMapping("/song/{id}")
	public String languageId(@PathVariable("id") Long id,Model model) {
		LookifyModel song = serv.findLookify(id);
		model.addAttribute("song",song);
		return "song.jsp";
	}
	
	@RequestMapping(value="/song/{id}/delete")
	public String destroy(@PathVariable("id") Long id) {
		serv.delete(id);
		return "redirect:/";
	}
	
	@RequestMapping("/search/{artist}")
	public String search(@PathVariable("artist") String artist, Model model) {
		List<LookifyModel> song = serv.getSearchSongs(artist);
		model.addAttribute("artist", artist);
		model.addAttribute("songs", song);
		return "/search.jsp";
	}
	
	@PostMapping("/search")
	public String search(@RequestParam("artist") String artist) {
		return "redirect:/search/"+artist;
	}
	
	@RequestMapping("/top10")
	public String getTop10(Model model) {
		List<LookifyModel> songs = serv.getTopTen();
		model.addAttribute("songs", songs);
		return "/topten.jsp";
	}
		

}
