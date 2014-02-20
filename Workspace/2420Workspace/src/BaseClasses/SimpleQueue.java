package BaseClasses;
/**
 * 
 * Queue using inheritance (non secure)
 *
 */
public class SimpleQueue extends SimpleList {

	public SimpleQueue () {
		super ("Default Queue");
	}
	public SimpleQueue (String name) {
		super (name);
	}
	public void enqueue (Object item) {
		super.insertAtBack(item);
	}
	public Object dequeue () {
		if  (super.isEmpty()) {
			return "Queue is already Empty.";
		} else  {
			return super.removeFromFront();
		}
	}
	public boolean isEmpty () {
		return super.isEmpty();
	}
	public Object peekAtFront () {
		Object o = super.removeFromFront();
		super.insertAtFront(o);
		return o;
	}
	public String print () {
		return super.print();
	}
}
