package javaBasics;

import java.util.HashMap;

public class JavaClasses {

	public static void main(String[] args) {

		String name="James";
		int x1 = 5;
		char chare='z';
		float zflo=15.50f;
		double bdoub=12.3345354;
		boolean blonz=true;

		System.out.println(name.toLowerCase());
		System.out.println(x1);
		System.out.println(chare);
		System.out.println(zflo);
		System.out.println(bdoub);
		System.out.println(blonz);

		int x = 10;
		int y = 20;
		System.out.println(x+y+ " is the sum of x and y.");

		int i = 10;
		System.out.println(i++);
		System.out.println(i);


		HashMap<String, Integer> map = new HashMap<>();
		map.put("apple", 1);
		map.put("banana", 2);
		map.put("cherry", 3);
		int totalFruits = map.get("apple") + map.get("banana") + map.get("cherry");
		System.out.println(totalFruits);

		String txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);

		String txt1 = "The character \\ is called backslash.";
		System.out.println(txt1);

		String txt2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt2.length());

		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));

		System.out.println(Math.max(5, 10));  


		int b1 = 3;
		int b2 = ++b1 * 5 / b1-- + --b1;
		System.out.println('y' + " = " + b2);


		//If Elseif Else

		int h=15;
		int o=20;


		if(h>o) {
			System.out.println("Hi");
		}
		else if(h==o) {

			System.out.println("Hi2");


		} else {
			System.out.println("Hi3");

		}

		//Shorthand if else

		String book=(10>12)?"Have a great day":"Have a nice day";
		System.out.println(book);



		//Switch Case
		int day=5;
		switch(day) {
		case 1:
			System.out.println("Hi1");
			break;
		case 2:
			System.out.println("Hi2");
			break;
		case 3:
			System.out.println("Hi3");
			break;
		case 4:
			System.out.println("Hi4");
			break;
		default:
			System.out.println("Hi Default");
		}

		//While Loop

		int j=0;
		while(j<=5) {
			System.out.println("Hello World While "+j);
			++j;
			System.out.println("Next Word "+j);
		}

		//Do While

		int m=0;
		do {
			System.out.println("Next Word Orde	r "+m);	
			++m;
		}
		while(m<5);

		//Nested for Loops
		for(int s=0;s<5;s++) {
			System.out.println(s);

			// Inner loop
			for (int a = 1; a <= 3; a++) {
				System.out.println(" Inner: " + a); // Executes 6 times (2 * 3)
			}
		}


		//For each for arrays
		String[] cars= {"Volvo","Toyota","Maruthi","Jeep"};
		for(String d: cars) {
			System.out.println(d);
			
			
			
		}

		//Break
		for (int q = 0; q < 10; q++) {
			if (q == 4) {
				break;
			}
			System.out.println(q);
		}

		//continue
		for (int e = 0; e < 10; e++) {
			if (e == 4) {
				continue;
			}
			System.out.println(e);
		}
		
	
	}

}
