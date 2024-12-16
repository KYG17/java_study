package com.study.practice05;

import java.util.HashSet;
import java.util.Set;

public class Run {
	public static void main(String[] args) {
		Set<Song> songset1 = new HashSet<Song>();
		songset1.add(new Song("APT.", "로제"));
		songset1.add(new Song("Whiplash","에스파"));
		songset1.add(new Song("Power", "G-Dragon"));
		Set<Song> songset2 = new HashSet<Song>();
		songset2.add(new Song("Whiplash","에스파"));
		songset2.add(new Song("Happy", "DAY 6"));
		songset2.add(new Song("Happy", "DAY 6"));
		
		System.out.println(songset1);
		System.out.println(songset2);
		
	}

}
