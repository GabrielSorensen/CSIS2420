package BaseClasses;
//basic node class
public class BinaryNode {
	private int key;
	//private Record; Could be complicated..Point of trees (database)
	private BinaryNode left;
	private BinaryNode right;
	
	public BinaryNode (int key, BinaryNode leftNode, BinaryNode rightNode) {
		this.key = key;
		this.left = leftNode;
		this.right = rightNode;
	}
	public BinaryNode (int key, BinaryNode rightNode) {
		this.key = key;
		this.right = rightNode;
		this.right = null;
	}
	public BinaryNode (int key) {
		this.key = key;
		this.left = this.right = null;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public BinaryNode getLeft() {
		return left;
	}
	public void setLeft(BinaryNode left) {
		this.left = left;
	}
	public BinaryNode getRight() {
		return right;
	}
	public void setRight(BinaryNode right) {
		this.right = right;
	}
	

	
}
