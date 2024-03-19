package javaBasics;

public class Collections {
	
	public static void main(String[] args) {
		
		
		//Arrays
		
		String[] cars= {"Volvo","Maruthi","Toyota","Audi","Kia"};
		System.out.println(cars[0]);
		cars[0]="Opel";
		System.out.println(cars[0]);
		System.out.println(cars.length);
		
		// For each in Array
		
		for(int i=0;i<cars.length;i++) {
			
			System.out.println(cars[i]);
				
		}
		
		//Multidimensional Array
		 int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		    System.out.println(myNumbers[1][1]);  
		    myNumbers[1][2] = 9;
		    System.out.println(myNumbers[1][2]);
		    
		    for(int i=0;i<myNumbers.length;i++) {
		    	for(int j=0;j<myNumbers[i].length;j++)	{
		    	System.out.println(myNumbers[i][j]);
		    }
		    
	}
	}

}
