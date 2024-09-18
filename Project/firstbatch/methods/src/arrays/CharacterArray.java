package arrays;
import java.util.Scanner;
class CharacterArray 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		char[] ch=new char[size];
		System.out.println("Enter the name..");
		for (int i = 0; i < ch.length; i++) 
		{
			ch[i]=s.next().charAt(0);
			System.out.println("entered character is "+ch[i]);
		}
		for (int j = ch.length-1; j >=0; j--) 
		{
			System.out.print(ch[j]+" ");
		}
		
		
	}

}
