package javaBasics;

public class JavaThreads2 implements Runnable {

	
	//Another way to create a thread is to implement the Runnable interface:
	//If the class implements the Runnable interface, the thread can be run by 
	//passing an instance of the class to a Thread object's constructor and then calling the thread's start() method:

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaThreads2 obj=new JavaThreads2();
		
		
		Thread thread=new Thread(obj);
		thread.start();
		System.out.println("This code is outside of the thread");

	}
	
	public void run() {
		System.out.println("This code is inside of the thread");
	}


}
