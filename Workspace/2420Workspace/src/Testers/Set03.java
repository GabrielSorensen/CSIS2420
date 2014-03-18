package Testers;

//sets using BST:
//Ordered according to BSTs'

import java.util.*;
import java.io.*;

import BaseClasses.Utilities;

public class Set03 {

	public static void main (String [] args) throws IOException {
		
		String [] wordArray = Utilities.fileToStringArray("./awmt.txt");
		List<String> wordList = Arrays.asList(wordArray);
		TreeSet<String> set1 = new TreeSet<String>(wordList);
		Iterator<String> it;
		
		it = set1.iterator();
		while (it.hasNext()) {
			if (condAB(it.next())) {
				it.remove();
			}
		}
		
		for (String s : set1) {
			System.out.println(s);
		}
		System.out.println("Set has "+ set1.size() + " elements");
		
		TreeSet<String> union = union(set1, set1);
		
		System.out.println("Union has "+ union.size() + " elements");
	}

	public static boolean condAB (String str) {
		if (str.compareToIgnoreCase("c")>= 0 ) {
			return true;
		}
		return false;
	}
	public static TreeSet<String> union (TreeSet<String> A, TreeSet<String> B) {
		TreeSet<String> result = A;
		result.addAll(B);
		return result;
	}
}
