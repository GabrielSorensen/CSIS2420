package Testers;

//sets using BST:
//Ordered according to BSTs'

import java.util.*;
import java.io.*;

import BaseClasses.Utilities;

public class Set02 {

	public static void main (String [] args) throws IOException {
		
		String [] wordArray = Utilities.fileToStringArray("./awmt.txt");
		List<String> wordList = Arrays.asList(wordArray);
		TreeSet<String> hs = new TreeSet<String>(wordList);
		
		for (String s : hs) {
			System.out.println(s);
		}
		System.out.println("Set has "+ hs.size() + " elements");
	}

}
