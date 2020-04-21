package com.marcelo.DojoOverflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelo.DojoOverflow.Repository.AnswerRepo;
import com.marcelo.DojoOverflow.Repository.QuestionRepo;
import com.marcelo.DojoOverflow.Repository.TagRepo;
import com.marcelo.DojoOverflow.Repository.TagsQuestionsRepo;

@Service
public class Serv {
	@Autowired
	private AnswerRepo answerRepo;
	private QuestionRepo questionRepo;
	private TagRepo tagRepo;
	
	
	

}
