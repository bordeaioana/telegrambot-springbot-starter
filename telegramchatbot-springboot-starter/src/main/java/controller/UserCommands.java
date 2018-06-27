package controller;

import service.AnotherMovieButtonAction;
import service.MessageCommandAction;
import service.MovieCommandAction;
import service.StartCommandAction;
import service.UnknownCommandAction;;



public enum UserCommands {

	UNKNOWN_COMMAND("", new UnknownCommandAction()),
	START_COMMAND("/start", new StartCommandAction()),
	MOVIE_COMMAND("/movie ", new MovieCommandAction()),
	ANOTHER_MOVIE_COMMAND("Another movie  information", new AnotherMovieButtonAction());



	private String commandText;
	private MessageCommandAction<?> action;

	private UserCommands(String commandText, MessageCommandAction<?> action) {
		this.commandText = commandText;
		this.action = action;
	}

	public String getCommandText() {
		return commandText;
	}

	public MessageCommandAction<?> getAction() {
		return action;
	}
	
	
}
