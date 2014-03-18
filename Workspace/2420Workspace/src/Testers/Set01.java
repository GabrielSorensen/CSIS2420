package Testers;

//sets using hash tables:
//No order, or a lack of order.

import java.util.*;
import java.io.*;

import BaseClasses.Utilities;

public class Set01 {

	public static void main (String [] args) throws IOException {
		
		String [] wordArray = Utilities.fileToStringArray("./awmt.txt");
		List<String> wordList = Arrays.asList(wordArray);
		HashSet<String> hs = new HashSet<String>(wordList);
		
		for (String s : hs) {
			System.out.println(s);
		}
		System.out.println("Set has "+ hs.size() + " elements");
	}

}
