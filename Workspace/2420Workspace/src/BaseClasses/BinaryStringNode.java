package BaseClasses;
//basic node class
public class BinaryStringNode {
	private String key;
	//private Record; Could be complicated..PoString of trees (database)
	private BinaryStringNode left;
	private BinaryStringNode right;
	
	public BinaryStringNode (String key, BinaryStringNode leftNode, BinaryStringNode rightNode) {
		this.key = key;
		this.left = leftNode;
		this.right = rightNode;
	}
	public BinaryStringNode (String key, BinaryStringNode rightNode) {
		this.key = key;
		this.right = rightNode;
		this.right = null;
	}
	public BinaryStringNode (String key) {
		this.key = key;
		this.left = this.right = null;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public BinaryStringNode getLeft() {
		return left;
	}
	public void setLeft(BinaryStringNode left) {
		this.left = left;
	}
	public BinaryStringNode getRight() {
		return right;
	}
	public void setRight(BinaryStringNode right) {
		this.right = right;
	}
	

	
}
