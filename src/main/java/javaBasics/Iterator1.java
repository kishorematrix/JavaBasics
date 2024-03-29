package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. 
		//It is called an "iterator" because "iterating" is the technical term for looping.
		//To use an Iterator, you must import it from the java.util package.

		//The iterator() method can be used to get an Iterator for any collection:


		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		Iterator<String> it=cars.iterator();
		String vechile=it.next();
		System.out.println(vechile);


		//To loop through a collection, use the hasNext() and next() methods of the Iterator:

		while(it.hasNext()) {
			System.out.println(it.next());
		}


		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(8);
		numbers.add(2);
		numbers.add(23);
		Iterator<Integer> it2 = numbers.iterator();


		//Iterators are designed to easily change the collections that they loop through. 
		//The remove() method can remove items from a collection while looping. 

		while(it2.hasNext()) {
			Integer i =it2.next();
			if(i<10) {
				it2.remove();
			}
		}
		System.out.println(numbers);

		//Note: Trying to remove items using a for loop or a for-each loop would not work correctly 
		//because the collection is changing size at the same time that the code is trying to loop.

	}
}
