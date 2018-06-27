package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.request.ParseMode;
import com.pengrad.telegrambot.model.request.ReplyKeyboardMarkup;
import com.pengrad.telegrambot.request.SendMessage;

import ro.vladfernoaga.telegram_chatbot_starter.dao.MessageDao;
import utils.MenuUtils;

@Service
public class StartCommandAction implements MessageCommandAction<Void> {
	
	
	@Autowired
	private MessageDao messageDao;
	
	@Override
	public Void execute(TelegramBot bot, Message message) {
		final Integer chatId = message.from().id();
		final Integer messageId = message.messageId();
		SendMessage botResponse;
		
		
			//personDao.insertPerson(chatId);
			
			//ReplyKeyboardMarkup shareKeyboard = MenuUtils.shareDetailsMenu(chatId, messageId);
			
			botResponse = new SendMessage(chatId,
					"Hi, I'm WeatherBOT. To receive daily notifications of your favorite location weather,"
							+ " please share your name, phone number and location.").parseMode(ParseMode.HTML)
									.disableNotification(false).replyToMessageId(messageId) ;
			
			bot.execute(botResponse);
		
		return null;
	}
}
