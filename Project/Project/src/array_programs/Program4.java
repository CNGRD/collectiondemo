//Wap to create Character Array to read your name character by character
package array_programs;
import java.util.Scanner;
public class Program4 
{
   public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Array size");
	   int size=sc.nextInt();
	   char[] ch=new char[size];
	   for(int i=0;i<=ch.length-1;i++)
	   {
		   System.out.println("Enter the character @ index"+i);
		   ch[i]=sc.next().charAt(0);
	   }
	   System.out.println("Name is :");
	   for(int i=0;i<=ch.length-1;i++)
	   {
		   System.out.print(ch[i]);
	   }
	   System.out.println();
	}

}
