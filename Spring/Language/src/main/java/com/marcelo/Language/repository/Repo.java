package com.marcelo.Language.repository;

import java.util.List;
import java.lang.Long;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.Language.models.Language;

@Repository
public interface Repo extends CrudRepository<Language, Long>{
	List<Language> findAll();
    
    
}
