package com.marcelo.DojoOverflow.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.DojoOverflow.models.Answers;

@Repository
public interface AnswerRepo extends CrudRepository<Answers, Long> {

}
