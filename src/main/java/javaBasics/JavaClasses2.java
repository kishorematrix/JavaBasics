package javaBasics;

public class JavaClasses2 {
	
	int x;
	
	public JavaClasses2(int y) {
		
		x=y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaClasses3 myObj1=new JavaClasses3();
		myObj1.fullThrottle();
		myObj1.speed(20);
		
		JavaClasses2 myObj3=new JavaClasses2(5);
		System.out.println(myObj3.x);
		
		
	}
	
	public static void test(int x, int y) {
		
		System.out.println(x+" "+ y);
		
		
	}


}
