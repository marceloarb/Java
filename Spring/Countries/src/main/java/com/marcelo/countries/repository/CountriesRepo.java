package com.marcelo.countries.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesRepo extends CrudRepository<Countries, Long>{
	
	


}
