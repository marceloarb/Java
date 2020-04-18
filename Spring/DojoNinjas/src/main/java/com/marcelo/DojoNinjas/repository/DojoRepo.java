package com.marcelo.DojoNinjas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.DojoNinjas.models.Dojo;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();
}
