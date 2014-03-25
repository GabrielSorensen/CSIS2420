package BaseClasses;
/**
 *insert
 *delete
 *search
 *
 *Direct Addressing...
 *
 *simple simple
 *collision resolution by chaining
 */
public class SimpleHash {
	public static void main (String [] args) {
		SimpleList [] hashTable = new SimpleList [157];
		int key = 0;
		int val = 0;
		for (int i=0; i< hashTable.length; i++) {
			hashTable[i] = new SimpleList("HashTable spot " + i);
		}
		for (int i=0; i<100; i++) {
			val = (int) (Math.random()*1000000);
			key = val % hashTable.length;
			hashTable[key].insertAtFront(val);
		}
		for (int i=0; i<hashTable.length; i++) {
			System.out.println(hashTable[i].print());
		}
	}
}
