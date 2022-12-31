package playground;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class StringToDateTime {
	public static void main(String[] args) throws Exception {
		/*
		 * TODO Auto-generated method stub
		 * 
		 * References for this tutorial:
		 * http://stackoverflow.com/questions/16910344
		 * /how-to-convert-string-into-date-time-format-in-java
		 * http://docs.oracle
		 * .com/javase/7/docs/api/java/text/SimpleDateFormat.html
		 * http://docs.oracle.com/javase/8/docs/api/java/util/Date.html
		 * http://docs
		 * .oracle.com/javase/7/docs/api/java/text/ParseException.html
		 */

		String s = "7/5/2012 2:44:26 AM";

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"MM/dd/yyyy hh:mm:ss a");
		try {
			Date date = simpleDateFormat.parse(s);

			System.out.println("date : " + simpleDateFormat.format(date));
		} catch (ParseException ex) {
			System.out.println("Exception " + ex);
		}

	}

}
