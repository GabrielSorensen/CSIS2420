package Testers;
import java.util.Random;

import BaseClasses.BinaryNodeTree;


public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryNodeTree tree = new BinaryNodeTree("tree", 500);
		Random r = new Random();
		int n = 0;
		for (int i=1; i<1000; i++) {
			n= (int)r.nextInt(1000);
//			System.out.println("Inserting: "+n);
			tree.insertNode(n);
		}
		System.out.println("");
		System.out.println("in order taversal");
		tree.inOrderTraversal(tree.getRoot());
		System.out.println();
		System.out.println();
		n = r.nextInt(1000);
		System.out.println("checking if " + n + " is in the cuurent tree:");
		System.out.println("result is: " + tree.find(n));
		n = r.nextInt(1000);
		System.out.println("checking if " + n + " is in the cuurent tree:");
		System.out.println("result is: " + tree.find(n));
		n = r.nextInt(1000);
		System.out.println("checking if " + n + " is in the cuurent tree:");
		System.out.println("result is: " + tree.find(n));
		n = r.nextInt(1000);
		System.out.println("checking if " + n + " is in the cuurent tree:");
		System.out.println("result is: " + tree.find(n));
		n = r.nextInt(1000);
		System.out.println("checking if " + n + " is in the cuurent tree:");
		System.out.println("result is: " + tree.find(n));
		n = r.nextInt(1000);
		System.out.println("checking if " + n + " is in the cuurent tree:");
		System.out.println("result is: " + tree.find(n));
		
	}

}
