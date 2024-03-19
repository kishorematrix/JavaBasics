package javaBasics;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> cars=new HashSet<String>();
		cars.add("Volvo");
		cars.add("Maruthi");
		cars.add("KIA");
		cars.add("BMW");
		cars.add("KIA");

		for(String j:cars) {
			System.out.println("Printing the String "+j);
		}
		
		System.out.println(cars);
		
		HashSet<Integer> numbers=new HashSet<Integer>();
			numbers.add(7);
			numbers.add(8);
			numbers.add(9);
			
			for(int i:numbers) {
				System.out.println("Printing the integer "+i);
			}
			
			for(int i=0;i<=10;i++) {
				if(numbers.contains(i)) {
					System.out.println("The variable i contains the number "+ i);
				}else {
					System.out.println("The variable i does not contains the number "+ i);
				}
				
			}
	
	}

}
