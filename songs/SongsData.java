package com.songs;

import java.util.List;

public class SongsData {
	
	public static List<Songs> getSongs() {

		return List.of(
				new Songs("$10", "Hitchhiker", "Electronic", 2016, 183),
				new Songs("Havana", "Camila Cabello", "R&B", 2017, 324),
				new Songs("Cassidy", "Grateful Dead", "Rock", 1972, 123),
				new Songs("50 ways", "Paul Simon", "Soft Rock", 1975, 199),
				new Songs("Hurt", "Nine Inch Nails", "Industrial Rock", 1995, 257),
				new Songs("Silence", "Delerium", "Electronic", 1999, 134),
				new Songs("Hurt", "Johnny Cash", "Soft Rock", 2002, 392),
				new Songs("Watercolour", "Pendulum", "Electronic", 2010, 155),
				new Songs("The Outsider", "A Perfect Circle", "Alternative Rock", 2004, 312),
				new Songs("With a Little Help from My Friends", "The Beatles", "Rock", 1967, 168),
				new Songs("Come Together", "The Beatles", "Blues rock", 1968, 173),
				new Songs("Come Together", "Ike & Tina Turner", "Rock", 1970, 165),
				new Songs("With a Little Help from My Friends", "Joe Cocker", "Rock", 1968, 46),
				new Songs("Immigrant Songs", "Karen O", "Industrial Rock", 2011, 12),
				new Songs("Breathe", "The Prodigy", "Electronic", 1996, 337),
				new Songs("What's Going On", "Gaye", "R&B", 1971, 420),
				new Songs("Hallucinate", "Dua Lipa", "Pop", 2020, 75),
				new Songs("Walk Me Home", "P!nk", "Pop", 2019, 459),
				new Songs("I am not a woman, I'm a god", "Halsey", "Alternative Rock", 2021, 384),
				new Songs("Pasos de cero", "Pablo Alborán", "Latin", 2014, 117),
				new Songs("Smooth", "Santana", "Latin", 1999, 244),
				new Songs("Immigrant Songs", "Led Zeppelin", "Rock", 1970, 484),
				new Songs("Hallelujah", "The Beatles", "Rock", 2001, 484)
				);
	}

}
