package com.marcelo.DojoNinjas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.marcelo.DojoNinjas.models.Dojo;
import com.marcelo.DojoNinjas.models.Ninja;
import com.marcelo.DojoNinjas.repository.DojoRepo;
import com.marcelo.DojoNinjas.repository.NinjaRepo;

@Service
public class Serv {
	private final DojoRepo dojorepo;
	private final NinjaRepo ninjarepo;
	
	public Serv(DojoRepo dojorepo,NinjaRepo ninjarepo) {
		this.dojorepo = dojorepo;
		this.ninjarepo = ninjarepo;
	}
	
	public Dojo newDojo(Dojo dojo) {
		return dojorepo.save(dojo);
	}
	public List<Dojo> allDojos(){
		return dojorepo.findAll();
	}
	public Ninja newNinja(Ninja ninja) {
		return ninjarepo.save(ninja);
	}
	
	
}
