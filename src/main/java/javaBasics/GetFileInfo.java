package javaBasics;

import java.io.File;

public class GetFileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To get more information about a file, use any of the File methods:
		File myObj=new File("filename.txt");
		
		if(myObj.exists()) {
		 System.out.println("File name: " + myObj.getName()); 
	      System.out.println("Absolute path: " + myObj.getAbsolutePath()); 
	      System.out.println("Writeable: " + myObj.canWrite()); 
	      System.out.println("Readable: " + myObj.canRead()); 
	      System.out.println("File size in bytes: " + myObj.length());
		}else {
			System.out.println("The file does not exist.");
			
		}
	}

}
