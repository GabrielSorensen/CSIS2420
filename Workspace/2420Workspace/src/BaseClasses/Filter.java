package BaseClasses;

//Iterators and filters
//Iterators are objects that are capable of traversing the entire data structure
//Filter: a boolean function that selects a subset of a data
// ex: all words with length <= 5

import java.io.*;
import java.util.*;
public class Filter {

	public static void main(String[] args) throws IOException {
		String [] wordarray = Utilities.fileToStringArray ("./awmt.txt");
		List<String> wordlist = Arrays.asList(wordarray);
		ArrayList<String> al = new ArrayList<String>(wordlist);

		Iterator<String> it = al.iterator();

		while (it.hasNext()) {
			if (condition(it.next())) {
				it.remove();
			}
		}
		for (String s : al) {
			System.out.println(s);
		}
	}
	public static boolean condition (String str) {
		return (str.length() >= 5);
	}

}
