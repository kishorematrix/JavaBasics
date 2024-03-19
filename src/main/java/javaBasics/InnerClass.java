package javaBasics;

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outclass=new OuterClass();
		OuterClass.Inner inner=outclass.new Inner();
		
		//An inner class can also be static, which means that you can access it without creating an object of the outer class:
		
		System.out.println(inner.y + outclass.x);
		
		//One advantage of inner classes, is that they can access attributes and methods of the outer class:
		System.out.println(inner.myInnerMethod());
		Type type=Type.PASS;
		
		System.out.println(type);
		
		for (Type myVar : Type.values()) {
			  System.out.println(myVar);
			}
	
	}
	
	
	
 


}

//The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.
//To access the inner class, create an object of the outer class, and then create an object of the inner class:
//Unlike a "regular" class, an inner class can be private or protected. 
//If you don't want outside objects to access the inner class, declare the class as private:


class OuterClass{
	int x = 10;
	  class Inner{
		  int y = 5;
		  
		  public int myInnerMethod() {
		      return x;
		    }
			
		}
}
