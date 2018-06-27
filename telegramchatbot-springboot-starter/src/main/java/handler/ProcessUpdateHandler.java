package handler;

import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;

import service.AnotherMovieButtonAction;
import service.MovieCommandAction;
import service.StartCommandAction;
import utils.MenuUtils;

@Service
public class ProcessUpdateHandler implements UpdatesListener{


	@Autowired
	private TelegramBot telegramBot;

	@Autowired
	private StartCommandAction startCommand;

	@Autowired
	private AnotherMovieButtonAction anotherMovieButton;
	
	@Autowired
	private MovieCommandAction movieButton;

	/**
	 * This method intercepts the user requests and sends them to the dispatcher
	 * method
	 */
	@Override
	public int process(List<Update> updates) {
		for (Update update : updates) {
			process(update);
		}
		return UpdatesListener.CONFIRMED_UPDATES_ALL;
	}

	/**
	 * This method dispatches the type of received update to the correct routine
	 * 
	 * @param update
	 */
	private void process(Update update) {
		 if (update.message() != null) {
			processUserMessages(update.message());
			return;
		}
	}

	public void processUserMessages(Message message) {
		final String messageText = message.text();

		
			switch (messageText) {
			case MenuUtils.START: {
				startCommand.execute(telegramBot, message);
				break;
			}
			
			case MenuUtils.ANOTHER_MOVIE: {
				anotherMovieButton.execute(telegramBot, message);
				break;
			}
		
		
			case MenuUtils.MOVIE: {
				movieButton.execute(telegramBot, message);
				break;
			}
			
			
		}
	}
}
