package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter the num1");
			int n1=s.nextInt();
			System.out.println("Enter the num2");
			int n2=s.nextInt();
			int res=n1/n2;
			System.out.println(res);
		}
		catch (ArithmeticException  e) 
		{
			System.out.println("Lo idiot");
			System.out.println("can not be divided by zero or character");
		}
		catch(InputMismatchException a)
		{
			System.out.println("lo stupid");
			System.out.println("can not divide by the cahracter or string");
		}
		//This is one more logic
//		catch(Exception e)
//		{
//			if(e instanceof ArithmeticException)
//			{
//				System.out.println("can not divide by 0");
//			}
//			else if(e instanceof InputMismatchException)
//			{
//				System.out.println("can divide by character or string");
//			}
//		}
		
	}

}
