package javaBasics;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In the following example, we use the Scanner class to read the contents of the text file we created in the previous chapter:

		try {
			File myObj = new File("filename.txt");
			Scanner myReader=new Scanner(myObj);
			while(myReader.hasNext()) {
				System.out.println(myReader.nextLine());
			}
			myReader.close();
		}
		catch(IOException e) {
			System.out.println("Error reading file");
			e.printStackTrace();

		}


	}

}
