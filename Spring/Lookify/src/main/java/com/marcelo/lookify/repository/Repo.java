package com.marcelo.lookify.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.lookify.models.LookifyModel;

@Repository
public interface Repo extends CrudRepository<LookifyModel, Long>{
	List<LookifyModel> findAll();
	
	List<LookifyModel> findByArtist(String artist);
	
	List<LookifyModel> findTop10ByOrderByRateDesc();
}
