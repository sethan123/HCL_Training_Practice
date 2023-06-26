//Create ar array using [1,2,2,3,3,4,4,5,6,7,8,8,9,9,10,10]
//use any collection  and get the unique elements from above array.
package Collections;

import java.util.Arrays;
import java.util.HashSet;


public class UniqueNumber {
	    public static void main(String[] args) {
	    	Integer[] array = {1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10, 10};          

	    	 

	        HashSet<Integer> uniqueElements = new HashSet<>(Arrays.asList(array));          

	 

	        System.out.println("Unique Elements:");

	 

	        for (int element : uniqueElements) {

	 

	            System.out.println(element);
	        }
	    }
	

}

