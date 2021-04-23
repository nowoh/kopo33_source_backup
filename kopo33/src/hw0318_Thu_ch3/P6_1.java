package hw0318_Thu_ch3;

import java.sql.Date;
import java.util.Calendar;

public class P6_1 {

	public static void main(String[] args) {
		//Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.MONTH) + 1);
		System.out.println(calendar.get(calendar.DATE));
		System.out.println(calendar.get(calendar.DATE) + 3);
		System.out.println(calendar.get(calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(calendar.DAY_OF_YEAR));
		System.out.println(calendar.get(calendar.HOUR));
		System.out.println(calendar.get(calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(calendar.MINUTE));
		System.out.println(calendar.get(calendar.SECOND));
		System.out.println(calendar.get(calendar.MILLISECOND));
	}
}



