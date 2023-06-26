//Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

// 
//
//Sample output:
//18 is even.
//Error: 7 is odd.


package Exception_Handling;

public class odd_or_Even {
	
	
	
	public static void checkEven(int n) throws Exception{		
		if(n%2!=0) {			
			throw new Exception();
		}
		
	
		
		
	}

	public static void main(String[] args) {
		int n1=8;
		int n2=7;
		
		
		try {
            checkEven(n1);
            System.out.println(n1 + " is even.");
        } catch (Exception e) {
            System.out.println("Error: " + n1 + " is odd.");
        }

        try {
            checkEven(n2);
            System.out.println(n2 + " is even.");
        } catch (Exception e) {
            System.out.println("Error: " + n2 + " is odd.");
				
		
		
	}
	
	}
}
