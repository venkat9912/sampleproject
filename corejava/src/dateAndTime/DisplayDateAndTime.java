package dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayDateAndTime {

	public static void main(String[] args) {
		
		//Date and Time Methods
			Date date=new Date();
				System.out.println(date.toString());
				System.out.println(date.getTime());
				System.out.println(date.clone());
				System.out.println(date.toGMTString());
				System.out.println(date.getTimezoneOffset());
				System.out.println(date.toLocaleString());
				
			SimpleDateFormat dateFormat=new SimpleDateFormat("E dd:MM:yyyy 'at' hh:mm:ss a zzz");

				System.out.println(dateFormat.format(date));
				
	}

}
