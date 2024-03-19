package javaBasics;


//When executing Java code, different errors can occur: 
//coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.
//When an error occurs, Java will normally stop and generate an error message. 
//The technical term for this is: Java will throw an exception (throw an error).

public class Exceptions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkAge(15); 


		//The try statement allows you to define a block of code to be tested for errors while it is being executed.
		//The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

		try {
			int[] numbers= {1,2,3,4};
			System.out.println(numbers[10]);

			//If an error occurs, we can use try...catch to catch the error and execute some code to handle it:

		}catch(Exception e) {
			System.out.println("Exception is Caught");

			//The finally statement lets you execute code, after try...catch, regardless of the result:
		}finally {
			System.out.println("The 'try catch' is finished.");
		}
	}


	//The throw statement allows you to create a custom error.
	//The throw statement is used together with an exception type. 
	//There are many exception types available in Java: ArithmeticException, FileNotFoundException, 
	//ArrayIndexOutOfBoundsException, SecurityException, etc:

	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		}
		else {
			System.out.println("Access granted - You are old enough!");
		}

	}
}
