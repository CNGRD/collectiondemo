//waptc to read your name character by character and print only character which is vowel
package array_programs;
import java.util.Scanner;
public class Program10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		char[] ch=new char[size];
		for(int i=0;i<ch.length;i++)
		{
			System.out.println("entered array element @ "+i);
			ch[i]=sc.next().charAt(0);
		}
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]=='a')||(ch[i]=='A')||(ch[i]=='e')||(ch[i]=='E')||(ch[i]=='i')||(ch[i]=='I')||(ch[i]=='o')||(ch[i]=='O')||(ch[i]=='u')||(ch[i]=='U')) 
			{
				System.out.println(ch[i]+" is vowel");
			}
		}
	}

}
