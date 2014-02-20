package BaseClasses;
//basic node class
public class binaryStringNode {
	private String key;
	//private Record; Could be complicated..PoString of trees (database)
	private binaryStringNode left;
	private binaryStringNode right;
	
	public binaryStringNode (String key, binaryStringNode leftNode, binaryStringNode rightNode) {
		this.key = key;
		this.left = leftNode;
		this.right = rightNode;
	}
	public binaryStringNode (String key, binaryStringNode rightNode) {
		this.key = key;
		this.right = rightNode;
		this.right = null;
	}
	public binaryStringNode (String key) {
		this.key = key;
		this.left = this.right = null;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public binaryStringNode getLeft() {
		return left;
	}
	public void setLeft(binaryStringNode left) {
		this.left = left;
	}
	public binaryStringNode getRight() {
		return right;
	}
	public void setRight(binaryStringNode right) {
		this.right = right;
	}
	

	
}
