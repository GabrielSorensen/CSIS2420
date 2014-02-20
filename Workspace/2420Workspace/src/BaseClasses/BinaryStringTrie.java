package BaseClasses;

public class BinaryStringTrie {

	private binaryStringNode root;
	private String name;

	public BinaryStringTrie () {
		this.name = "Default Tree";
		this.root = null;
	}
	public BinaryStringTrie (String name) {
		this.name = name;
		this.root = null;
	}
	public BinaryStringTrie (String name, String key) {
		this.name = name;
		this.root = new binaryStringNode(key);
	}
	public boolean isEmpty() {
		if (root == null) {
			return true;
		} else  {
			return false;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public binaryStringNode getRoot() {
		return root;
	}
	public void setRoot(binaryStringNode root) {
		this.root = root;
	}
	public void insertNode(String key) {
		binaryStringNode n = new binaryStringNode(key);
		insertInTree(n, root);
	}
	private void insertInTree(binaryStringNode node, binaryStringNode parent) { //if parent is not known set as root
		if (isEmpty()) {
			node = this.root;
		}
		if (node != parent) {
			if (node.getKey().compareTo(parent.getKey()) == 0) { 
				System.out.println("Duplicate Key. Key was Not added.");
			}
			if (node.getKey().compareTo(parent.getKey()) < 0) { 
				if (parent.getLeft() == null) {
					parent.setLeft(node);
				} else {
//					System.out.println("<-");
					insertInTree(node, parent.getLeft());
				}
			} else if (node.getKey().compareTo(parent.getKey()) > 0) {
				if (parent.getRight() == null) {
					parent.setRight(node);
				} else {
//					System.out.println("->");
					insertInTree(node, parent.getRight());
				}
			}
		} else {
			System.err.println("Key was already in tree!");
		}
	}
	
	public void clearTree() {
		this.root = null;
	}
	
	//Kick ass algorithm to traverse tree
	public void inOrderTraversal (binaryStringNode node) {
		if (node == null) {  //grounding condition
			return;
		}
		inOrderTraversal(node.getLeft());
		System.out.print(node.getKey() + " ");
		inOrderTraversal(node.getRight());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
