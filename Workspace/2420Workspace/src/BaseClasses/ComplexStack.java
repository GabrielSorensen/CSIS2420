package BaseClasses;
/**
 * 5. Rewrite the Stack2 class using composition, and write an appropriate test driver. 
 *  Then remove the print method and replace it with a “peek()” method 
 *  that only returns the object at the top of the stack without removing it.
 *   Post the code for the final class which models the stack ADT.
 * 
 * Stack data struct.
 * Last in First out (lifo)
 * Keys: Push, Pop, peek
 * Applications: Compiling, Parsing Arithmetic Expressions, Execution( Main Stack, Secondary stacks, etc)
 * 
 */
public class ComplexStack {
	
	private SimpleList s;
	
	public ComplexStack () {		s = new SimpleList("Default Stack");
	}
	public ComplexStack (String name) {
		s = new SimpleList(name);
	}
	
	public void push (Object o) {
		s.insertAtFront(o);
	}
	public Object pop () {
		if (s.isEmpty()) {
			return "Stack was Empty";
		} else  {
			return s.removeFromFront();
		}
	}
	public boolean isEmpty () {
		return s.isEmpty();
	}
	public Object peekAtTop () {
		Object o = this.pop();
		this.push(o);
		return o;
	}
}
