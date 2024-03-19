package javaBasics;



/*Threads allows a program to operate more efficiently by doing multiple things at the same time.
 * Threads can be used to perform complicated tasks in the background without interrupting the main program.
*/

/*There are two ways to create a thread.
 * It can be created by extending the Thread class and overriding its run() method:
 * If the class extends the Thread class, 
 * the thread can be run by creating an instance of the class and call its start() method:
*/


public class JavaThreads extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaThreads thread=new JavaThreads();
		thread.start();
		System.out.println("This code is outside of the thread");
		}
	
	
	public void run() {
		System.out.println("This code is inside of the thread");
	}

}
