package ro.vlafernoaga.telegram_chatbot_starter.dao;


import java.util.List;
//import com.intech.shareresources.model.CategoryBase;


public interface MovieDao {

  MovieBase findbyMovieTitle(String title);

 
}
