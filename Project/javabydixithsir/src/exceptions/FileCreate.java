package exceptions;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
public class FileCreate {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the file path:");
		String path=s.next();
		try {
			FileOutputStream f=new FileOutputStream(path);
			System.out.println("file created successfully!!!!!!!");
			System.out.println("Thank you");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("file not created ,enter valid file path");
			//e.printStackTrace();
			System.out.println("Thank you");
		}
		

	}

}
