package objects;
import java.util.Scanner;
public class BirdTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the color of  the bird");
		String color=s.next();
		Bird b1=new Bird(color);
		System.out.println("*****************************");
		System.out.println("Enter the color of  the bird");
		String color=s.next();
		Bird b2=new Bird(color);

	}

}
