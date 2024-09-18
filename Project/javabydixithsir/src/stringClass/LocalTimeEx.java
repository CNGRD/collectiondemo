package stringClass;

import java.time.LocalTime;

public class LocalTimeEx {

	public static void main(String[] args) {
		LocalTime t1=LocalTime.now();
		System.out.println(t1);
		System.out.println(t1.getHour());
		System.out.println(t1.getMinute());
		System.out.println(t1.getSecond());
		System.out.println(t1.getNano());
	}

}
