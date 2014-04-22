package Testers;
import java.util.*;

import BaseClasses.OrderedPair;

public class orderedTest {

	public static void main(String[] args) {
		OrderedPair [] opArray = {
				new OrderedPair("the", 10),
				new OrderedPair("first", 12),
				new OrderedPair("last", 4),
				new OrderedPair("to", 7),
				new OrderedPair("win", 10),
				new OrderedPair("race", 1),
		};
		List<OrderedPair> opList = Arrays.asList(opArray);
		
		for (OrderedPair o : opList) {
			System.out.println(o.toString());
		}
	}

}
