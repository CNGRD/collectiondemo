package wrapperclass;
import java.util.ArrayList;
public class AddIndex {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add("Bombay");
		a.add("Belur");
		a.add("Hassan");
		System.out.println("************");
		int s=a.size();
		System.out.println("Size of an arraylist:"+s);
		a.add(1, "Manglore");
		System.out.println(a);
		System.out.println("*************");

	}

}
