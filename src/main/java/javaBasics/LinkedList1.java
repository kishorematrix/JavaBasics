package javaBasics;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//The LinkedList class is almost identical to the ArrayList:
		//The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
		//The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface. 
		//This means that you can add items, change items, remove items and clear the list in the same way.
		//However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.
		
		/*
		 * How the ArrayList works
		 * The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. 
		 * If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.
		 * 
		 */
		
		/*
		 * The LinkedList stores its items in "containers." 
		 * The list has a link to the first container and each container has a link to the next container in the list. 
		 * To add an element to the list, 
		 * the element is placed into a new container and that container is linked to one of the other containers in the list.
		 */
		
		/*
		 * When the rate of addition or removal rate is more than the read scenarios, then go for the LinkedList. 
		 * On the other hand, when the frequency of the read scenarios is more than the addition or removal rate, then ArrayList takes precedence over LinkedList.
		 * Since the elements of an ArrayList are stored more compact as compared to a LinkedList; therefore, the ArrayList is more cache-friendly as compared to the LinkedList. 
		 * Thus, chances for the cache miss are less in an ArrayList as compared to a LinkedList. Generally, it is considered that a LinkedList is poor in cache-locality.
		 * Memory overhead in the LinkedList is more as compared to the ArrayList. 
		 * It is because, in a LinkedList, we have two extra links (next and previous) as it is required to store the address of the previous and the next nodes, and these links consume extra space. 
		 * Such links are not present in an ArrayList.
		 */
		
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    
	    cars.addFirst("Mazda");
	    System.out.println(cars);
	    
	    cars.addLast("Mazda");
	    System.out.println(cars);
	    
	 // Use removeFirst() remove the first item from the list
	    cars.removeFirst();
	    System.out.println(cars);
	    
	 // Use removeLast() remove the last item from the list
	    cars.removeLast();
	    System.out.println(cars);
	    
	 // Use getFirst() to display the first item in the list
	    System.out.println(cars.getFirst());
	    
	 // Use getLast() to display the last item in the list
	    System.out.println(cars.getLast());
	}

}
