package com.songs;

public class Songs {
	private String title;
	private String artist;
	private String genre;
	private int year;
	private int timesPlayed;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTimesPlayed() {
		return timesPlayed;
	}
	public void setTimesPlayed(int timesPlayed) {
		this.timesPlayed = timesPlayed;
	}
	public Songs(String title, String artist, String genre, int year, int timesPlayed) {
		super();
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.year = year;
		this.timesPlayed = timesPlayed;
	}
	public Songs() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Songs [title=" + title + ", artist=" + artist + ", genre=" + genre + ", year=" + year + ", timesPlayed="
				+ timesPlayed + "]";
	}
	

}
