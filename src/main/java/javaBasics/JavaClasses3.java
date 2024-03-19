package javaBasics;

public class JavaClasses3 {
	
	 // Create a fullThrottle() method
	  public void fullThrottle() {
	    System.out.println("The car is going as fast as it can!");
	  }

	  // Create a speed() method and add a parameter
	  public void speed(int maxSpeed) {
	    System.out.println("Max speed is: " + maxSpeed);
	  }
	  
	  
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaClasses3 myObj3=new JavaClasses3();
		
		myObj3.fullThrottle();
		myObj3.speed(30);

	}


}
