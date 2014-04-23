package Testers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import BaseClasses.OrderedPair;
import BaseClasses.Utilities;

public class Set06CountWords {

	public static void main(String[] args) throws IOException {
		String [] WA = Utilities.fileToStringArray("./awmt.txt");
		List<String> WL = new ArrayList<String>();
		for (String s : WA) {
			//to lower case here.
			String d = s.toLowerCase();
			WL.add(d);
		}
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
		OrderedPair [] opArray = new OrderedPair[allKeys.size()];
		int index = 0;
		while (ki.hasNext()) {
			key = ki.next();
			value = TM.get(key);
			opArray[index++] = new OrderedPair(key, value);
		}
		List<OrderedPair> opList = Arrays.asList(opArray);
		//just sorting in reverse order below
		Collections.sort(opList, Collections.reverseOrder());
		for (OrderedPair o : opList) {
			String s = o.key;
			int times = o.value;
			System.out.println("Word :" + s + ": occurs " + times + " time(s) in our text file");
		}

	}

}
