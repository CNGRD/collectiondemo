//Wap to create double Array,provide the size and elements during runtime

package array_programs;
import java.util.Scanner;
public class Program3 
{
    public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the array size");
	  int size=sc.nextInt();
	  double[] d1=new double[size];
	  for(int i=0;i<=d1.length-1;i++)
	  {
		  System.out.println("Enter the element for index"+i);
		  d1[i]=sc.nextDouble();
	  }
	  System.out.println("enter the choice");
	  System.out.println("enter 1 to display elements");
	  System.out.println("enter 0 not to display elements");
	  int choice=sc.nextInt();
	  if(choice==1)
	  {
		  for(int i=0;i<=d1.length-1;i++)
		  {
			  System.out.println("Array elements are "+d1[i]);
		  }
	  }
	  else
		  System.out.println("Thank you ,visit again");
	}

}
