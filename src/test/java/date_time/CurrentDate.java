//Get current date using Date class and format it like e.g., 04/01/85 10:02:250

package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		
		Date currentDate = new Date();	
		SimpleDateFormat d = new SimpleDateFormat("MM/dd/yy HH:mm:ss:SSS");
    String formattedDate = d.format(currentDate);
    System.out.println(formattedDate);

		
		
		

	}

}
