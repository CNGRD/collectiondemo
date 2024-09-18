package pack1;
import java.util.Scanner;
public class Stringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		String arr[]=new String[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the elements @ "+i+" : ");
			arr[i]=sc.next();
			
		}
		System.out.println("araay is original order");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(" ");
		System.out.println("araay is reverse order");
		int revInt[] =new int[size];
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}*/

	}

}
