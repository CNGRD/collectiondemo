package string_programs;
import java.util.Scanner;
/*public class Program6 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.next();
	System.out.println("Enter The Charcater");
	char ch = sc.next().charAt(0);
	int count=0;
	for(int i=0;i<=s.length()-1;i++)
	{
		if()
		count++;
	}
	System.out.println("The number characters count is "+count);
	}

}*/
public class Program6//With built in function replace(arg1,agr2)
{
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		String s2=s1.replace(ch+"","");
		int count=s1.length()-s2.length();
		System.out.println("Number of given Character "+ch+" is "+count);
	}
}
