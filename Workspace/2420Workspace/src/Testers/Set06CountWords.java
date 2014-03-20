package Testers;

import java.io.*;
import java.util.*;

import BaseClasses.Utilities;

public class Set06CountWords {

	public static void main(String[] args) throws IOException {
		String [] WA = Utilities.fileToStringArray("./awmt.txt");
		List<String> WL = Arrays.asList(WA);
		TreeMap<String,Integer> TM = new TreeMap<String,Integer>();
		String key;
		Integer value;
		Iterator<String> it = WL.iterator();
		
		while (it.hasNext()) {
			key = it.next();
			value = TM.get(key);
			if (value == null) {
				TM.put(key, 1);
			} else {
				TM.put(key, value+1);
			}
		}
		Set<String> allKeys = TM.keySet();
		Iterator<String> ki = allKeys.iterator();
		
		while (ki.hasNext()) {
			key = ki.next();
			value = TM.get(key);
			System.out.println(key + " appears " + value + " times.");
		}
	}

}
