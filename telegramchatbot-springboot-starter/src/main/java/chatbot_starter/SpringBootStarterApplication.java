package chatbot_starter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import model.ListOfMovieDetails;

@SpringBootApplication
public class SpringBootStarterApplication {

	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterApplication.class, args);
		
	}

}
