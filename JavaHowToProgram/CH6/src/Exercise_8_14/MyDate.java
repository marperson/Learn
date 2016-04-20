package Exercise_8_14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
	
	private static Date day = "";
	MyDate(int month, int day, int year){
		String format = "mm,dd,Y";
		String s = month+" "+day+,+year;
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		day = sdf.parse(s);
	}
	
	MyDate(String month, int day, int year){
		
	}
	MyDate(int day, int year){
	
	}
	
	

	public String Output(int type) {
		String output = "null";
		Date myDate = new Date();
		if (type == 1) {
			output = String.format("%tm/%td/%tY ", myDate, myDate, myDate);
		}
		else if(type ==2){
			output = String.format("%tB %td, %tY ", myDate, myDate, myDate);
		}
		else if (type == 3){
			output = String.format("%tj %tY ", myDate, myDate);
		}
		return output;
	}
	
	
}
