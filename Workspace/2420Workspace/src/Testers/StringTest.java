package Testers;

import BaseClasses.*;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "Zebra";
		String s2 = "Antelope";
		String s3 = "Eagle";
//		String s4 = "Animal";
		
//		System.out.println(s1.compareTo(s2)); // =25  eg 25 letters z is above a.
//		System.out.println(s2.compareTo(s1));// =-25  eg 25 letters z is below a.
//		System.out.println(s1.compareTo(s3)); // = 21
//		System.out.println(s1.compareTo(s1)); // = 0 eg exact same
		
		BinaryStringNode child1 = new BinaryStringNode(s1);
		BinaryStringNode child2 = new BinaryStringNode(s2);
		BinaryStringNode root = new BinaryStringNode(s3, child2, child1);
		System.out.println(root.getKey());
		System.out.println();
		System.out.println(root.getLeft().getKey());
		System.out.println();
		System.out.println(root.getRight().getKey());
		
	}

}
