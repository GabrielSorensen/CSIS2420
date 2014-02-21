package Testers;
import BaseClasses.*;
public class ListTest {

	public static void main(String[] args) {
		SimpleList lst = new SimpleList();
		for (int i=1; i<101; i++) {
			lst.insertAtBack(i*i);
		}
		System.out.println(lst.print());
	}
}
