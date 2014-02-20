package BaseClasses;
/**
 * Stack data struct.
 * Last in First out (lifo)
 * Keys: Push, Pop
 * Applications: Compiling, Parsing Arithmetic Expressions, Execution( Main Stack, Secondary stacks, etc)
 * 
 */
// Simple Stack implemented by Inheritance.
public class SimpleStack extends SimpleList {
	public SimpleStack () {
		super("Default Stack");
	}
	public SimpleStack (String s) {
		super(s);
	}
	public void push (Object o) {
		super.insertAtFront(o);
	}
	public Object pop () {
		if (!super.isEmpty()) {
			return super.removeFromFront();
		} else {
			return "Stack was empty";
		}
	}
	public boolean isEmpty () {
		return super.isEmpty();
	}
	public String print () {
		return super.print();
	}
	public void reverse (String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10) {
		SimpleStack s = new SimpleStack();
		s.push(s1);
		System.out.println(s.print());
		s.push(s2);
		System.out.println(s.print());
		s.push(s3);
		System.out.println(s.print());
		s.push(s4);
		System.out.println(s.print());
		s.push(s5);
		System.out.println(s.print());
		s.push(s6);
		System.out.println(s.print());
		s.push(s7);
		System.out.println(s.print());
		s.push(s8);
		System.out.println(s.print());
		s.push(s9);
		System.out.println(s.print());
		s.push(s10);
		System.out.println(s.print());
		s.pop();
		System.out.println(s.print());
		s.pop();
		System.out.println(s.print());
		s.pop();
		System.out.println(s.print());
		s.pop();
		System.out.println(s.print());
		s.pop();
		System.out.println(s.print());
		s.pop();
		System.out.println(s.print());
		s.pop();
		System.out.println(s.print());
		s.pop();
		System.out.println(s.print());
		s.pop();
		System.out.println(s.print());
		s.pop();
		System.out.println(s.print());
	}
}
