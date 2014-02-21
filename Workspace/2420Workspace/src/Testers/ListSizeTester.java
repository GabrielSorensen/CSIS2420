package Testers;

import BaseClasses.SimpleList;

public class ListSizeTester {

	public static void main(String[] args) {
		SimpleList lst = new SimpleList("List1");
		for (int i=0; i<=3; i++) {
			lst.insertAtFront(i);
		}
		System.out.println(lst.print());
		SimpleList list2 = lst.getCopy();
		System.out.println(list2.print());
		SimpleList list3 = lst.append(list2);
		System.out.println(list3.print());
	}
}
