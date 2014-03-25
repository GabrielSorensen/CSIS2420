package Testers;

import BaseClasses.BinaryNode;

public class w3e9 {

	public static void main(String[] args) {
		int a = 10;
		int b = 6;
		int c = 73;
		int d = 47;
		int e = 48;
		int f = 0;
		int g = 75;
		int h = 22;
		int i = 63;
		int j = 48;
		
		BinaryNode root = new BinaryNode(a);
		BinaryNode nodeB = new BinaryNode(b);
		BinaryNode nodeC = new BinaryNode(c);
		BinaryNode nodeD = new BinaryNode(d);
		BinaryNode nodeE = new BinaryNode(e);
		BinaryNode nodeF = new BinaryNode(f);
		BinaryNode nodeG = new BinaryNode(g);
		BinaryNode nodeH = new BinaryNode(h);
		BinaryNode nodeI = new BinaryNode(i);
		BinaryNode nodeJ = new BinaryNode(j);
		
		root.setLeft(nodeB);
		root.setRight(nodeC);
		nodeB.setLeft(nodeF);
		nodeC.setLeft(nodeD);
		nodeC.setRight(nodeG);
		nodeD.setLeft(nodeH);
		nodeD.setRight(nodeE);
		nodeE.setLeft(nodeJ);
		nodeE.setRight(nodeI);
		
		inOrderTraversal(root);
	}
	public static void inOrderTraversal (BinaryNode node) {
		if (node == null) {  //grounding condition
			return;
		}
		inOrderTraversal(node.getLeft());
		System.out.print(node.getKey() + " ");
		inOrderTraversal(node.getRight());
	}

}
