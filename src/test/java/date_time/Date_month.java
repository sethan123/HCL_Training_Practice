package date_time;

import java.util.Calendar;
import java.util.Date;
//1. save date, month and year in an integer array and print (sample output - [04, 01, 85])
public class Date_month {
	public static void main(String[] args) {	
	 Calendar calendar = Calendar.getInstance();
     calendar.setTime(new Date()); 

     int[] dateArray = new int[3];
     dateArray[0] = calendar.get(Calendar.DATE);
     dateArray[1] = calendar.get(Calendar.MONTH) + 1; 
     dateArray[2] = calendar.get(Calendar.YEAR) % 100; 

     System.out.print("[");
     for (int i = 0; i < dateArray.length; i++) {
         System.out.print(String.format("%02d", dateArray[i]));
         if (i != dateArray.length - 1) {
             System.out.print(", ");
         }
     }
     System.out.println("]");
	
	

}
}
