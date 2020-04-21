package com.marcelo.countries.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelo.countries.repository.CitiesRepo;
import com.marcelo.countries.repository.CountriesRepo;
import com.marcelo.countries.repository.LanguagesRepo;

@Service
public class ApiService {
	@Autowired
	private CountriesRepo countriesRepo;
	private LanguagesRepo languagesRepo;
	private CitiesRepo citiesRepo;
}
