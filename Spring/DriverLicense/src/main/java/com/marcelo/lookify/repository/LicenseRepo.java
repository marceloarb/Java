package com.marcelo.lookify.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.lookify.models.License;

@Repository
public interface LicenseRepo extends CrudRepository <License, Long> {
	List<License> findAll();
}
