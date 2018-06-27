package utils;

import com.pengrad.telegrambot.model.request.KeyboardButton;
import com.pengrad.telegrambot.model.request.ReplyKeyboardMarkup;



public final class MenuUtils {
	
	public final static String START = "/start";
	public final static String MOVIE = "/movie ";
	public final static String ANOTHER_MOVIE = "Another movie";

	
	public static ReplyKeyboardMarkup showMenu() {
		final KeyboardButton Movie = new KeyboardButton("Show movie");
		
		
		final KeyboardButton[][] buttonsList = new KeyboardButton[1][2];
		buttonsList[0][0] = Movie;
		
		
		final ReplyKeyboardMarkup replyKeyboard = new ReplyKeyboardMarkup(buttonsList);
		replyKeyboard.resizeKeyboard(true);
		replyKeyboard.oneTimeKeyboard(true);
		return replyKeyboard;
	}
	


}
