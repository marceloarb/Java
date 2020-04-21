package com.marcelo.DojoOverflow.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.DojoOverflow.models.Questions;

@Repository
public interface QuestionRepo extends CrudRepository<Questions, Long>{

}
