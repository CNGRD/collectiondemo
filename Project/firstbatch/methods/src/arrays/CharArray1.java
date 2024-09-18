package arrays;
import java.util.Scanner;
class CharArray1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		char[] ch=new char[size];
		for (int i = 0; i < ch.length; i++) 
		{
		  ch[i]=sc.next().charAt(0);
		  System.out.println("Entered element @ index "+i+" is "+ch[i]);
		}
		
		boolean flag=false;
		for (int i = 0; i < ch.length; i++) 
		{
			if (ch[i]=='Z'||ch[i]=='z') 
			{
				flag=true;
				
			} 
		}
		if(flag==true)
		{
			System.out.println("Z is present");
		}
		else
		{
			System.out.println("Z is not present");
		}
		
	}

}
