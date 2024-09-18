package exceptions;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st num");
		int n1=s.nextInt();
		System.out.println("Enter the 2nd num");
		int n2=s.nextInt();
		int res=n1/n2;//ArithmaticException
		System.out.println("the result is :"+res);
		System.out.println("Thank you");
	}

}
