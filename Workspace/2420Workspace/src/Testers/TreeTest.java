package Testers;
import java.util.Random;

import BaseClasses.BinaryNodeTree;

public class TreeTest {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		BinaryNodeTree tree = new BinaryNodeTree("tree", 5000);
		Random r = new Random();
		int n = 0;
		start = System.currentTimeMillis();
		for (int i=1; i<=10000; i++) {
			n = (int) (r.nextDouble()*1000000);
			System.out.print(n + " ");
			tree.insertNode(n);
		}
		System.out.println();
		long end = System.currentTimeMillis();
		System.out.println("This took "+(end-start)+" miliseconds");
		tree.inOrderTraversal(tree.getRoot());
	}

}
