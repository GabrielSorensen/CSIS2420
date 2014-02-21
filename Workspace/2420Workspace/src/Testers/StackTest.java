package Testers;
import BaseClasses.*;

public class StackTest {

	public static void main(String[] args) {

		ComplexStack stack = new ComplexStack();

		for (int i=0; i<40; i++) {
			System.out.println(stack.peekAtTop());
			stack.push(i);
		}

		System.out.println(stack.peekAtTop()+"\n");

		for (int i=0; i<41; i++) {
			stack.peekAtTop();
			System.out.println(stack.pop());
		}
	}	
}
