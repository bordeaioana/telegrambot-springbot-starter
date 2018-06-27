package handler;

import java.io.IOException;
import java.util.List;

import com.pengrad.telegrambot.Callback;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pengrad.telegrambot.model.CallbackQuery;
import com.pengrad.telegrambot.model.Message;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ForceReply;
import com.pengrad.telegrambot.model.request.ParseMode;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.request.BaseRequest;
import com.pengrad.telegrambot.response.BaseResponse;

import antlr.Utils;



@Service
public class SimpleUpdateHandler implements UpdatesListener {

	/** The Constant LOGGER. */
	public static final Logger LOGGER = LogManager.getLogger();

	@Autowired
	private TelegramBot bot;

	
	@Override
	public int process(List<Update> updates) {
		for (Update update : updates) {
			process(update);
		}
		return UpdatesListener.CONFIRMED_UPDATES_ALL;
	}
	
	// Process free text input from user
	private void process(Update update) {
		if (update.message() != null) {
			processUserMessages(update.message());
			return;
		}
	}
	
	public void processUserMessages(Message message) {
		final String messageText = message.text();
		
		if (messageText.startsWith(Utils.FAVORITE_LOCATION)) {
			favoriteLocationCommand.execute(telegramBot, message);
		} else if (messageText.startsWith(Utils.CHOSEN_LOCATION_CURRENT_WEATHER)) {
			chosenLocationWeatherCommand.execute(telegramBot, message);
		} else {
			switch (messageText){
			case Utils.START_COMMAND: {
				startCommand.execute(telegramBot, message);
				break;
			}
	
			case Utils.ANOTHER_MOVIE: {
				anotherMovieButton.execute(telegramBot, message);
				break;
			}
		
			default: {
				unknownButton.execute(telegramBot, message);
				break;
			}
			}
		}
		
	}
}


