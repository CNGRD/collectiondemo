package wrapperclass;
import java.util.ArrayList;
public class AddAllInd {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add("Kia");
		a.add("LAmborgini");
		int s=a.size();
		System.out.println("Size of list 1:"+s);
		System.out.println("***********************");
		ArrayList a1=new ArrayList<>();
		a1.add("KiaShefoo");
		a1.add("Carren");
		a1.add("Ferrari");
		int s1=a1.size();
		System.out.println("Size of list 2:"+s1);
		System.out.println("***********************");
		a1.addAll(1, a);
		System.out.println(a1);
		
	}

}
