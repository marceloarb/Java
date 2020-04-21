package com.marcelo.countries.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguagesRepo extends CrudRepository<Languages,Long>{
	
	
	@Query(value="SELECT name,language,percentage FROM languages WHERE language = 'Slovene' ORDER BY DESC ", nativeQuery=true)
	List<Object[]> getName();

}
