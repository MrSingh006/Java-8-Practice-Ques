package com.songs;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Songs> songs = SongsData.getSongs();
//		findAllRockSongs(songs);		
		/* all songs having artist Beatles, greater than 1995 and starting with "H" */
//		exampleOne(songs);
		
//		listAllGenres(songs);
		
//		notOriginalArtist(songs);
		
//		sortSongs(songs);
//		joinWords(songs);
//		genreExistOrNot(songs);
		findFirstOccurrence(songs);
	}
	

	public static void findAllRockSongs(List<Songs> songs)
	{
		List<Songs> rocklist =songs.stream().filter(i1->i1.getGenre().toUpperCase().contains("ROCK")).collect(Collectors.toList());
		rocklist.stream().forEach(System.out::println);
	}
	public static void exampleOne(List<Songs> songs)
	{
		List<Songs> examplelist = songs.stream().filter(i1->i1.getArtist().contains("Beatles"))
				.filter(i1->i1.getYear()>1995)
				.filter(i1->i1.getTitle().startsWith("H"))
				.collect(Collectors.toList());
		
		examplelist.stream().forEach(System.out::println);
	}
	private static void listAllGenres(List<Songs> songs) {
		//approach one
		List<String> genrelist = songs.stream().map(i1->i1.getGenre()).distinct().collect(Collectors.toList());
		genrelist.stream().forEach(System.out::println);
		
		//approach two
		Set<String> gen = songs.stream().map(song -> song.getGenre()).collect(Collectors.toSet());
		System.out.println(gen);
				
		long count = songs.stream().map(Songs::getGenre).distinct().count();
		System.out.println(count);
		
		
	}
	
	private static void notOriginalArtist(List<Songs> songs) {
		String songTitle = "With a Little Help from My Friends";
		List<String> artistlist = songs.stream().filter(i1->i1.getTitle().equals(songTitle))
				.map(i1->i1.getArtist())
				.filter(artist->!artist.contains("Beatles"))
				.collect(Collectors.toList());
		
		System.out.println(artistlist);
	}
	
	private static void sortSongs(List<Songs> songs) {
		List<Songs> sortedlist = songs.stream().sorted((i1,i2)->i1.getTitle().compareTo(i2.getTitle())).collect(Collectors.toList());
		sortedlist.stream().forEach(System.out::println);
	}
	
	private static void joinWords(List<Songs> songs) {
		String s = songs.stream().map(Songs::getArtist).distinct().collect(Collectors.joining(","));
		System.out.println(s);
	}

	private static void genreExistOrNot(List<Songs> songs) {
		boolean exists = songs.stream().anyMatch(i1->i1.getGenre().equalsIgnoreCase("R&B"));
		System.out.println(exists);
		
	}

	private static void findFirstOccurrence(List<Songs> songs) {
		List<Songs> s = songs.stream().filter(i1->i1.getYear()==1995).limit(1).collect(Collectors.toList());
		s.stream().forEach(System.out::println);
		
		//2nd approach
		Optional<Songs> optional=songs.stream().filter(i1->i1.getYear()==1995).findFirst();
		System.out.println(optional.get());
	}





}
