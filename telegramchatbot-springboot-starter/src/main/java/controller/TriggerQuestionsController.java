package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import service.QuestionService;

@RestController
public class TriggerQuestionsController {

	@Autowired
	private QuestionService senderService;

	@RequestMapping(value = "/question/{lessonSessionKey}/{questionId}", method = RequestMethod.GET)
	public ResponseEntity<Void> triggerQuestion(@PathVariable("lessonSessionKey") String lessonSessionKey,
			@PathVariable("questionId") long questionId) {
		
		senderService.sendQuestionToRegisteredMovies(lessonSessionKey, questionId);

		return ResponseEntity.ok().build();
	}

}
