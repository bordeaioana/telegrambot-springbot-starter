package chatbot_starter.dto;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieDto {

	private long id;
	private String title;
	private String released;
	private String runtime;
	private String genre;
	private String actions;
	private String plot;
	private String language;
	private String country;
	private String awards;
	private String metascore;
	private String imdbrating;
}

