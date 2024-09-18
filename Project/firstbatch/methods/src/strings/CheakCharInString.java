package strings;
import java.util.Scanner;
public class CheakCharInString 
{

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter A String");
	   String str=sc.nextLine();
	   
	  System.out.println("Enter A Character");
	   char ch=sc.next().charAt(0);
	   
	  boolean isPresent=false;
	   
	  for(int i=0; i<str.length(); i++)
	  {
		  if(str.charAt(i)==ch)
		  {
			 isPresent=true; 
		  }
	  }
	  if(isPresent)
	  {
		  System.out.println("The character "+ch+"is present in the string");
	  }
	  else
	  {
		  System.out.println("The Character "+ch+"is not present");
	  }
	}

}
