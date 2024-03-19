package javaBasics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in);

	    System.out.println("Enter name, age and salary:");

	    // String input
	    String name = myObj.nextLine();

	    // Numerical input
	    int age = myObj.nextInt();
	    double salary = myObj.nextDouble();

	    // Output input by user
	    System.out.println("Name: " + name); 
	    System.out.println("Age: " + age);
	    System.out.println("Salary: " + salary); 
	    
	    LocalDate myObj1=LocalDate.now();
	    System.out.println(myObj1); // Display the current date
	    
	    LocalTime myObj2=LocalTime.now();
	    System.out.println(myObj2); // Display the current Time
	    
	    LocalDateTime myObj3 = LocalDateTime.now();
	    System.out.println(myObj3);
	    
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = myObj3.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);

	}

}
