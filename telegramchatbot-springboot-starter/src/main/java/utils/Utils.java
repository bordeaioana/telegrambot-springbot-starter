package utils;

import com.pengrad.telegrambot.model.request.KeyboardButton;
import com.pengrad.telegrambot.model.request.ParseMode;
import com.pengrad.telegrambot.model.request.ReplyKeyboardMarkup;
import com.pengrad.telegrambot.request.SendMessage;

public final class Utils {

	// Define the token (key) for the various API(s) utilized throughout this
	// project
	public static final String BOT_API_TOKEN = "583335521:AAHVM5XFjGPnIJViBjHRMRjHTIaZspTdhOg";
	


	public final static String START = "/start";
	public final static String MOVIE = "/movie ";
	public final static String ANOTHER_MOVIE= "Another movie";




	
	public static ReplyKeyboardMarkup showForecastMenu() {
		final KeyboardButton Movie = new KeyboardButton("Show movie");
		

		final KeyboardButton[][] buttonsList = new KeyboardButton[1][2];
		buttonsList[0][0] = Movie;
	

		final ReplyKeyboardMarkup replyKeyboard = new ReplyKeyboardMarkup(buttonsList);
		replyKeyboard.resizeKeyboard(true);
		replyKeyboard.oneTimeKeyboard(true);
		return replyKeyboard;
	}

	
	
}
