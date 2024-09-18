package stringClass;
import java.time.*;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		LocalDate d1=LocalDate.of(s.nextInt(),s.nextInt(),s.nextInt());
		LocalDate c1=LocalDate.now();
		System.out.println(d1);//current date
		System.out.println(c1.getYear()-d1.getYear());
		System.out.println(c1.getMonthValue()-d1.getMonthValue());
		System.out.println(c1.getDayOfMonth()-d1.getDayOfMonth());
		LocalDate birth=LocalDate.of(1999, 02, 9);
		LocalDate today=LocalDate.now();
		System.out.println("Birth date is :"+birth);
		System.out.println("Toady Date is :"+today);
	}

}
