package model;



	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	/**
	 * This is the entity class for the Advice table
	 * 
	 * @author stan4
	 *
	 */
	@Entity
	@Table(name = "movie", schema = "public")
	public class MovieModel {
		
		@Override
		public String toString() {
			return "MovieModel [id=" + id + ", title=" + title + ", released=" + released + ", runtime=" + runtime
					+ ", genre=" + genre + ", actors=" + actors + ", plot=" + plot + ", language=" + language
					+ ", country=" + country + ", awards=" + awards + ", metascore=" + metascore + ", imdbrating="
					+ imdbrating + "]";
		}

		@Id
		@Column(name = "ID")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		@Column(name = "TITLE", unique = true)
		private String title;
		
		@Column(name = "RELEASED", unique = true)
		private String released;
		
		@Column(name = "RUNTIME", unique = true)
		private String runtime;
		
		@Column(name = "GENRE", unique = true)
		private String genre;
		
		@Column(name = "ACTORS", unique = true)
		private String actors;
		
		@Column(name = "PLOT", unique = true)
		private String plot;
		
		@Column(name = "LANGUAGE", unique = true)
		private String language;
		
		@Column(name = "COUNTRY", unique = true)
		private String country;
		
		@Column(name = "AWARDS", unique = true)
		private String awards;
		
		@Column(name = "METASCORE", unique = true)
		private String metascore;
		
		@Column(name = "IMDBRATING", unique = true)
		private String imdbrating;
		
		
		
		
		
		
		
		
		
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getReleased() {
			return released;
		}

		public void setReleased(String released) {
			this.released = released;
		}

		public String getRuntime() {
			return runtime;
		}

		public void setRuntime(String runtime) {
			this.runtime = runtime;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getActors() {
			return actors;
		}

		public void setActors(String actors) {
			this.actors = actors;
		}

		public String getPlot() {
			return plot;
		}

		public void setPlot(String plot) {
			this.plot = plot;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getAwards() {
			return awards;
		}

		public void setAwards(String awards) {
			this.awards = awards;
		}

		public String getMetascore() {
			return metascore;
		}

		public void setMetascore(String metascore) {
			this.metascore = metascore;
		}

		public String getImdbrating() {
			return imdbrating;
		}

		public void setImdbrating(String imdbrating) {
			this.imdbrating = imdbrating;
		}

		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
	
		
	}