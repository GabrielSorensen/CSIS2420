package BaseClasses;
//own-rolled list class
public class SimpleList {

	private Node firstNode;
	private Node lastNode;
	private String name;

	public SimpleList () {
		this.name = "Default SimpleList";
		this.firstNode = this.lastNode = null;
	}
	public SimpleList (String name) {
		this.name = name;
		this.firstNode = this.lastNode = null;
	}
	public void insertAtFront (Object item) {
		//1	create node
		//2 point to first node
		//3 reassign
		if (isEmpty()) {
			this.firstNode = this.lastNode = new Node (item);
		} else {
			this.firstNode = new Node (item, this.firstNode);
		}
	}
	public void insertAtBack (Object item) {
		//1	create node
		//2 point to last node
		//3 reassign
		if (isEmpty()) {
			this.firstNode = this.lastNode = new Node (item);
		} else {
			this.lastNode.setNext(new Node(item));
			this.lastNode = lastNode.getNext();
		}
	}
	public Object removeFromFront () {
		Object o = null;
		if (isEmpty()) {
			return "This List is Empty";
		}
		o = this.firstNode.getData();
		if (this.firstNode.equals(this.lastNode)) {
			this.firstNode = this.lastNode = null;
		} else {
			this.firstNode = this.firstNode.getNext();
		}
		return o;
	}
	public Object removeFromBack () {
		Object o = null;
		if (isEmpty()) {
			return "This List is Empty";
		}
		o = this.lastNode.getData();
		if (this.firstNode.equals(this.lastNode)) {
			this.firstNode = this.lastNode = null;
		} else {
			Node n = this.firstNode;
			while (n!=null) {
				if (n.getNext().equals(this.lastNode)) {
					n.setNext(null);
					this.lastNode = n;
				}
				n = n.getNext();
			}
		}
		return o;
	}
	public boolean isEmpty() {
		return this.firstNode == null;
	}
	public int size () {
		int c = 0;
		if (isEmpty()) {
			return c;
		} else {
			Node node = this.firstNode;
			while (node.getNext()!=null) {
				node = node.getNext();
				c++;
			}
			return c;
		}
	}
	public SimpleList getCopy () {
		SimpleList list = new SimpleList ("Copy of "+this.name);
		Node node = this.firstNode;
		list.insertAtFront(node.getData());
		while(node.getNext()!=null) {
			node = node.getNext();
			Object a = node.getData(); 
			list.insertAtBack(a);
		}
		return list;
	}
	public SimpleList append(SimpleList list) {
		SimpleList result = new SimpleList();
		Node node = this.firstNode;
		result.insertAtFront(node.getData());
		while(node.getNext()!=null) {
			node = node.getNext();
			result.insertAtBack(node.getData());
		}
		node = list.firstNode;
		result.insertAtBack(node.getData());
		while(node.getNext()!=null) {
			node = node.getNext();
			result.insertAtBack(node.getData());
		}
		return result;
	}
	public void linkFirstLast () {
		this.lastNode.setNext(this.firstNode);
	}
	public String print () {
		int c = 0;
		String r = new String();
		String n = "\n"; 
		if (isEmpty()) {
			r +=this.name+" IS EMPTY!"+n;
			return r;
		}
		r += this.name + " Contains :" +n;
		Node node = this.firstNode;
		while(node!=null) {
			r += node.getData().toString()+n;
			node = node.getNext();
			if (node == this.lastNode) {
				c++;
			}
			if (c==3) {
				return r;
			}
		}
		return r;
	}
}
