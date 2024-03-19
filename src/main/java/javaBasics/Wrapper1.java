package javaBasics;

public class Wrapper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
		//Sometimes you must use wrapper classes, for example when working with Collection objects, 
		//such as ArrayList, where primitive types cannot be used (the list can only store objects):

		//To create a wrapper object, use the wrapper class instead of the primitive type. 
		//To get the value, you can just print the object:
		
		Integer myInt = 5;
	    Double myDouble = 5.99;
	    Character myChar = 'A';
	    System.out.println(myInt);
	    System.out.println(myDouble);
	    System.out.println(myChar);
	    
	    //Another useful method is the toString() method, which is used to convert wrapper objects to strings.
	    //In the following example, we convert an Integer to a String, 
	    //and use the length() method of the String class to output the length of the "string":
	    
	    Integer myInt1 = 100;
	    String myString = myInt1.toString();
	    System.out.println(myString.length());
	    System.out.println(myString);
	}

}
