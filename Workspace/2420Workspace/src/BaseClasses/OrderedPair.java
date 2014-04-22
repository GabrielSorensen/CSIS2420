package BaseClasses;
//our own way to compare ordered-Paired objects
public class OrderedPair implements Comparable<OrderedPair> {

	public String key;
	public Integer value;

	public OrderedPair (String word, Integer freq) {
		this.key = word;
		this.value = freq;
	}
	public boolean equals (Object o) {
		if (!(o instanceof OrderedPair)) { //check to make sure we are actually using an ordered pair,
			return false;
		}
		OrderedPair op = (OrderedPair) o;  //if true then check if the ordered pairs are equal.
		return op.value.equals(this.value);
	}
	public int hashCode () {
		return value;
	}
	public String toString () {
		return ("\n[" + this.key +" , "+ this.value + "]");
	}
	@Override
	public int compareTo(OrderedPair o) {
		return (this.value-o.value);
	}
}