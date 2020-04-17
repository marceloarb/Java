package com.marcelo.lookify.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.marcelo.lookify.models.License;
import com.marcelo.lookify.models.Person;
import com.marcelo.lookify.repository.LicenseRepo;
import com.marcelo.lookify.repository.PersonRepo;

@Service
public class Serv {
	private final PersonRepo personrepo;
	private final LicenseRepo licenserepo;
	
	public Serv(PersonRepo personrepo,LicenseRepo licenserepo) {
		this.personrepo = personrepo;
		this.licenserepo = licenserepo;
	}
	
	public Person createPerson(Person person) {
		return personrepo.save(person);
	}
	
	public List<Person> allPeople(){
		return personrepo.findAll();
	}
	public License createLicense(License license) {
		return licenserepo.save(license);
	}
}
