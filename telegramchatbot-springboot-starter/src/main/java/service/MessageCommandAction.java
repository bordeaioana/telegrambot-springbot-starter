package service;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Message;

public interface MessageCommandAction<T> {

	public T execute(TelegramBot bot, Message m);
}
