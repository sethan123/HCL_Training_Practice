package date_time;
import java.util.Calendar;
import java.util.Date;
public class descending_order {
	    public static void main(String[] args) {
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(new Date());

	        int[] timeArray = new int[3];
	        timeArray[0] = calendar.get(Calendar.HOUR_OF_DAY);
	        timeArray[1] = calendar.get(Calendar.MINUTE);
	        timeArray[2] = calendar.get(Calendar.SECOND);

	        System.out.print("Original array: ");
	        printArray(timeArray);

	        
	        for (int i = 0; i < timeArray.length - 1; i++) {
	            for (int j = 0; j < timeArray.length - i - 1; j++) {
	                if (timeArray[j] < timeArray[j + 1]) {
	                
	                    int temp = timeArray[j];
	                    timeArray[j] = timeArray[j + 1];
	                    timeArray[j + 1] = temp;
	                }
	            }
	        }

	        System.out.print("Sorted array (descending order): ");
	        printArray(timeArray);
	    }

	    private static void printArray(int[] array) {
	        System.out.print("[");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i]);
	            if (i != array.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }
	}


