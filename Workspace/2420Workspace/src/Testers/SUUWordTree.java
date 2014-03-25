package Testers;

import java.io.IOException;

import BaseClasses.BinaryStringTrie;
import BaseClasses.Utilities;

public class SUUWordTree {

	public static void main(String[] args) throws IOException {
		String [] wordArray = Utilities.fileToStringArray("./SUU.txt");
		BinaryStringTrie stringTree = new BinaryStringTrie("About SUU", "the");
		for (String s : wordArray) {
//			System.out.println(s);
			stringTree.insertNode(s);
		}
		System.out.println("Done adding strings to tree");
		
		stringTree.inOrderTraversal(stringTree.getRoot());
	}

}
