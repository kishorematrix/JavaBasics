package javaBasics;

import java.util.Scanner;

public class TestAdding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the value for X :");
		int x=myObj.nextInt();
		
		System.out.println("Enter the value for Y :");
		int y=myObj.nextInt();
		
		int sum=x+y;
		System.out.println("The sume of the values x + y is :"+ sum);
		
		myObj.close();
	}

}
