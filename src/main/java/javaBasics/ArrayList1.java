package javaBasics;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {

		//The ArrayList class is a resizable array, which can be found in the java.util package.
		//The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified 
		//(if you want to add or remove elements to/from an array, you have to create a new one). 
		//While elements can be added and removed from an ArrayList whenever you want. 
		//The syntax is also slightly different:



		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Maruthi");
		cars.add("KIA");
		cars.add("BMW");
		System.out.println(cars);
		System.out.println(cars.get(0));
		int z=cars.size();
		System.out.println(z);
		cars.set(0, "Mazda");
		System.out.println(cars.get(0));

		System.out.println("Accessing for Loop ");


		for (String i : cars) {
			System.out.println(i);
		}
		System.out.println("Existing for Loop ");
		System.out.println("Existing for Loop1 ");
		System.out.println("Existing for Loop2 ");
		cars.remove(0);
		System.out.println(cars.get(0));
		System.out.println(cars.get(0));
		System.out.println(cars.get(0));
		System.out.println(cars.get(0));
		////Testing GIT
		
		
		System.out.println(cars.get(0));
		System.out.println(cars.get(0));
		System.out.println(cars.get(0));
		System.out.println(cars.get(0));
		cars.clear();
		System.out.println(cars);

		//Elements in an ArrayList are actually objects. 
		//In the examples above, we created elements (objects) of type "String". 
		//Remember that a String in Java is an object (not a primitive type). 
		//To use other types, such as int, you must specify an equivalent wrapper class: Integer. 
		//For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(22);
		myNumbers.add(35);
		myNumbers.add(20);
		myNumbers.add(25);

		//Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically:
		Collections.sort(myNumbers);
		for (int j : myNumbers) {
			System.out.println(j);
		}

	}
}
