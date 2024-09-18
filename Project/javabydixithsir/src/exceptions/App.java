package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class App {

	public static void main(String[] args) 
	{
		try {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the distance in km/h");
		int distance=s.nextInt();
		System.out.println("enter the time in h");
		int time=s.nextInt();
		Calculator c=new Calculator();
		int res=c.div(distance, time);
		System.out.println(res+" km/h is the speed ");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dear user,time can not be Zero");
			System.out.println("Re launch Application!!!-''-");
			//e.printStackTrace();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter integer only..!!! and re launch the APP");
		}
		catch(Throwable e)
		{
			System.out.println("Sorry,Something went wrong..!!");
			System.out.println("COME AFTER SOMETIME");
		}
	}

}
