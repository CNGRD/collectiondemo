package collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class ForEach {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements");
		Object o=s.next();
		List l=new ArrayList<>();
		
		l.add(o);
		for (Object o1 : l) {
			System.out.println(o1);
			
		}
		

	}

}
