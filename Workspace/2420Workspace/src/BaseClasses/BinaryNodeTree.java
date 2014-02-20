package BaseClasses;

public class BinaryNodeTree {

	private BinaryNode root;
	private String name;

	public BinaryNodeTree () {
		this.name = "Default Tree";
		this.root = null;
	}
	public BinaryNodeTree (String name) {
		this.name = name;
		this.root = null;
	}
	public BinaryNodeTree (String name, int key) {
		this.name = name;
		this.root = new BinaryNode(key);
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
	public BinaryNode getRoot() {
		return root;
	}
	public void setRoot(BinaryNode root) {
		this.root = root;
	}
	public void insertNode(int key) {
		BinaryNode n = new BinaryNode(key);
		insertInTree(n, root);
	}
	private void insertInTree(BinaryNode node, BinaryNode parent) { //if parent is not known set as root
		if (isEmpty()) {
			node = this.root;
		}
		if (node != parent) {
			if (node.getKey() <= parent.getKey()) { 
				if (parent.getLeft() == null) {
					parent.setLeft(node);
				} else {
					//					System.out.println("<-");
					insertInTree(node, parent.getLeft());
				}
			} else if (node.getKey() > parent.getKey()) {
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
	public void inOrderTraversal (BinaryNode node) {
		if (node == null) {  //grounding condition
			return;
		}
		inOrderTraversal(node.getLeft());
		System.out.print(node.getKey() + " ");
		inOrderTraversal(node.getRight());
	}
	public int min() {
		BinaryNode result = this.getRoot();
		while (result.getLeft()!=null) {
			result = result.getLeft();
		}
		return result.getKey();
	}
	public int max() {
		BinaryNode result = this.getRoot();
		while (result.getRight()!=null) {
			result = result.getRight();
		}
		return result.getKey();
	}
	public boolean find(int key) {
		BinaryNode current = this.getRoot();
		while (current != null) {
			if (key == current.getKey()) {
				return true;
			} else if (key < current.getKey()) {
				current = current.getLeft();
			} else if (key > current.getKey()) {
				current = current.getRight();
			}
		}
		return false;
	}













}
