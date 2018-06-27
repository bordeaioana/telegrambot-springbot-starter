package ro.vladfernoaga.telegram_chatbot_starter.service;

package service;

import chatbot_starter.dto.MovieDto;
import ro.unitbv.eduassistant.dto.QuestionDto;

public interface MovieService {

	void createMovie(MovieDto movieDto);
	
	String createMovie(Long movieId);
	
	void addQuestion(QuestionDto questionDto, long lessonId);
}

