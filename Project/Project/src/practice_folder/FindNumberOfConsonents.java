package practice_folder;
import java.util.Scanner;
public class FindNumberOfConsonents 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		int size=sc.nextInt();
		char[] ch=new char[size];
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.println("Enter the element @ index : "+i);
			ch[i]=sc.next().charAt(0);
		}
		int count=0;
		for(int i=0;i<=ch.length-1;i++)
		{
			if((ch[i]!='A')||(ch[i]!='E')||(ch[i]!='I')||(ch[i]!='O')||(ch[i]!='U')||(ch[i]!='a')||(ch[i]!='e')||(ch[i]!='i')||(ch[i]!='o')||(ch[i]!='u'))
			{
				count++;
			}
		}
		System.out.println("the count of consonents elements in given array is :"+count);
	}

}
