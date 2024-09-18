package wrapperclass;
import java.util.ArrayList;
public class AddAll {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		ArrayList b=new ArrayList();
		b.add("Surya");
		b.add("Rolex");
		b.add("Dilli");
		a.add("Vikram");
		a.add("Doctor");
		a.addAll(b);
		b.add(a);
		
		int s1=b.size();
		System.out.println("Capacity of b:"+s1);
		System.out.println(a);
		int s=a.size();
		System.out.println("After adding a to b :"+s);
		
	}

}
