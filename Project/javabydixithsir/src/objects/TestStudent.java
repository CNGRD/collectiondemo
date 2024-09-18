package objects;
import java.util.Scanner;
public class TestStudent 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Student1 Sid");
		int sid=s.nextInt();
		Student s1=new Student(sid);
		System.out.println("******************************");
		System.out.println("Enter the Student2 Sid");
		System.out.println("Enter the Student2 Sname");
		int sid1=s.nextInt();
		String sname=s.next();
		Student s2=new Student(sid1,sname);
		System.out.println("*******************************");
		System.out.println("Enter the Student3 Sid");
		System.out.println("Enter the Student3 Sname");
		System.out.println("Enter the Student3 Age");
		int sid2=s.nextInt();
		String sname2=s.next();
		int age=s.nextInt();
		Student s3=new Student(sid2,sname2,age);
		
	}

}
