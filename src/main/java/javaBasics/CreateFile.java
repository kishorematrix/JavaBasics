package javaBasics;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			//To create a file in a specific directory (requires permission), 
			//specify the path of the file and use double backslashes to escape the "\" character (for Windows). 
			//On Mac and Linux you can just write the path, like: /Users/name/filename.txt
			//File myObj = new File("C:\\Users\\MyName\\filename.txt");
			
			File obj=new File("filename.txt");
			if(obj.createNewFile()) {
				System.out.println("File is created "+obj.getName());
				
			}else {
				System.out.println("File already exits");
			}
			
		}catch(IOException e) {
			System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
	
		
		
		
		
	}

}
