package com.azrecommendation.movieentity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MovieEntity {

    @Id
    private int id;
    private String letter;
    private String movieName;
    private String genre;
    private String director;
    private int releaseYear;
    private double rating;
    private String language;
    private String logoUrl;
    private String description;
    public MovieEntity() {
    }
	public MovieEntity(int id, String letter, String movieName, String genre, String director, int releaseYear,
			double rating, String language, String logoUrl, String description) {
		super();
		this.id = id;
		this.letter = letter;
		this.movieName = movieName;
		this.genre = genre;
		this.director = director;
		this.releaseYear = releaseYear;
		this.rating = rating;
		this.language = language;
		this.logoUrl = logoUrl;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "MovieEntity [id=" + id + ", letter=" + letter + ", movieName=" + movieName + ", genre=" + genre
				+ ", director=" + director + ", releaseYear=" + releaseYear + ", rating=" + rating + ", language="
				+ language + ", logoUrl=" + logoUrl + ", description=" + description + "]";
	}

}
