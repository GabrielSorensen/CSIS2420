package Testers;

//sets using BST:
//Ordered according to BSTs'

import java.util.*;
import java.io.*;

import BaseClasses.Utilities;

public class Set05 {

	public static void main (String [] args) throws IOException {
		
		String [] wordArray = Utilities.fileToStringArray("./awmt.txt");
		List<String> wordList = Arrays.asList(wordArray);
		TreeSet<String> set1 = new TreeSet<String>(wordList);
		TreeSet<String> set2 = new TreeSet<String>(wordList);
		
		System.out.println("Set1 an has "+ set1.size() + " elements before iterator");
		Iterator<String> it;
		
		it = set1.iterator();
		while (it.hasNext()) {
			if (condG7(it.next())) {
				it.remove();
			}
		}
		
		for (String s : set1) {
			System.out.println(s);
		}
		System.out.println("Set1 has "+ set1.size() + " elements after iterator");
		it = set2.iterator();
		while (it.hasNext()) {
			if (condLE7(it.next())) {
				it.remove();
			}
		}
		
		for (String s : set1) {
			System.out.println(s);
		}
		System.out.println("Set2 has "+ set2.size() + " elements after iterator");
		
		TreeSet<String> union = union(set1, set2);
		System.out.println("Union has "+ union.size() + " elements");
		TreeSet<String> union2 = intersect(set1, set2);
		System.out.println("Intersect has "+ union2.size() + " elements");
	}

	public static boolean condAB (String str) {
		if (str.compareToIgnoreCase("c")>= 0 ) {
			return true;
		}
		return false;
	}
	public static boolean condG7 (String str) {
		if (str.length() > 7) {
			return true;
		}
		return false;
	}
	public static boolean condLE7 (String str) {
		if (str.length() <= 7) {
			return true;
		}
		return false;
	}
	public static TreeSet<String> union (TreeSet<String> A, TreeSet<String> B) {
		TreeSet<String> result = new TreeSet<String>();
		result.addAll(A);
		result.addAll(B);
		return result;
	}
	public static TreeSet<String> intersect (TreeSet<String> A, TreeSet<String> B) {
		TreeSet<String> result = new TreeSet<String>();
		result.addAll(A);
		result.retainAll(B);
		return result;
	}
}
