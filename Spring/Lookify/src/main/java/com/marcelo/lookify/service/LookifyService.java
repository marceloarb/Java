package com.marcelo.lookify.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.marcelo.lookify.models.LookifyModel;
import com.marcelo.lookify.repository.Repo;

@Service
public class LookifyService {
	private final Repo repo;
	
	public LookifyService(Repo repo) {
		this.repo = repo;
	}
	public List<LookifyModel> allSongs(){
		return repo.findAll();
	}
	public LookifyModel createSong(LookifyModel song) {
		return repo.save(song);
		
	}
	public LookifyModel findLookify(Long id) {
		Optional<LookifyModel> lookify = repo.findById(id);
		if(lookify.isPresent()) {
			return lookify.get();
		}
		else {
			return null;
		}
		
	}
	public void delete(Long id) {
		repo.deleteById(id);
	}
	public List<LookifyModel> getSearchSongs(String artist) {
		return repo.findByArtist(artist);
	}
	public List<LookifyModel> getTopTen(){
		return repo.findTop10ByOrderByRateDesc();
	}
	
	
	

}
