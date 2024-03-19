package javaBasics;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To delete a file in Java, use the delete() method:
		
		 File myObj = new File("filename.txt"); 
		    if (myObj.delete()) { 
		      System.out.println("Deleted the file: " + myObj.getName());
		    } else {
		      System.out.println("Failed to delete the file.");
		    } 

	}

}
