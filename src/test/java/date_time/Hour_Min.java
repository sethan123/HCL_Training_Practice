package date_time;

import java.util.Calendar;
import java.util.Date;
//2. save hours, minutes and seconds in one another integer array, print it (sample output - [10, 02, 250]) and find the smaller number in the array (sample output - 02)
public class Hour_Min {		
		    public static void main(String[] args) {
		        Calendar calendar = Calendar.getInstance();
		        calendar.setTime(new Date());

		        int[] timeArray = new int[3];
		        timeArray[0] = calendar.get(Calendar.HOUR_OF_DAY);
		        timeArray[1] = calendar.get(Calendar.MINUTE);
		        timeArray[2] = calendar.get(Calendar.SECOND);

		        System.out.print("[");
		        for (int i = 0; i < timeArray.length; i++) {
		            System.out.print(String.format("%02d", timeArray[i]));
		            if (i != timeArray.length - 1) {
		                System.out.print(", ");
		            }
		        }
		        System.out.println("]");

		        int smallestNumber = findSmallestNumber(timeArray);
		        System.out.println("Smallest number: " + String.format("%02d", smallestNumber));
		    }

		    private static int findSmallestNumber(int[] array) {
		        int smallest = array[0];
		        for (int i = 1; i < array.length; i++) {
		            if (array[i] < smallest) {
		                smallest = array[i];
		            }
		        }
		        return smallest;
		    }
		
}





