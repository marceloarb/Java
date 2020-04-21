package com.marcelo.DojoOverflow.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.DojoOverflow.models.Tags;

@Repository
public interface TagRepo extends CrudRepository<Tags, Long> {

}
