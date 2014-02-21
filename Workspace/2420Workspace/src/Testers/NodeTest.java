package Testers;
import BaseClasses.*;
import java.math.BigInteger;


public class NodeTest {

	private static Node n1;
	private static Node n2;
	private static Node n3;
	private static Node n4;
	private static Node n0;
	private static Node n9;
	
	public static void main(String[] args) {	
		BigInteger bi = new BigInteger("99999");
		Character c = new Character((char) 'v');
		
		n9 = new Node(c);
		n0 = new Node(bi);
		n1 = new Node("Sorensen");
		n2 = new Node("Gabe");
		n3 = new Node("CS");
		n4 = new Node("Sophomore", null);
		n9.setNext(n0);
		n0.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		
		System.out.println(n9.getNext());
		System.out.println(n9.getData());
		System.out.println("\n");
		System.out.println(n0.getNext());
		System.out.println(n0.getData());
		System.out.println("\n");
		System.out.println(n1.getNext());
		System.out.println(n1.getData());
		System.out.println("\n");
		System.out.println(n2.getNext());
		System.out.println(n2.getData());
		System.out.println("\n");
		System.out.println(n3.getNext());
		System.out.println(n3.getData());
		System.out.println("\n");
		System.out.println(n4.getNext());
		System.out.println(n4.getData());
	}

}
