package com.marcelo.Language.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.marcelo.Language.models.Language;
import com.marcelo.Language.repository.Repo;


@Service
public class LanguageService {
	private final Repo repo;
	
	public LanguageService(Repo repo) {
		this.repo = repo;
	}
	public List<Language> allLanguage(){
		return repo.findAll();
	}
	public Language createLanguage(Language l) {
		return repo.save(l);
	}
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = repo.findById(id);
		if(optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		}
		else {
			return null;
		}
	}
	public Language addLanguage(Language l) {
    	return repo.save(l);
    }
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
