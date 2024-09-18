package wrapperclass;
import java.util.List;
import java.util.ArrayList;
public class RetainAll {

	public static void main(String[] args) {
		List l1=new ArrayList<>();
		l1.add("Reta");
		l1.add("MAr");
		l1.add("Beso");
		l1.add("Leh");
		System.out.println(l1);
		System.out.println("************");
		List l2=new ArrayList<>();
		l2.add("Chow");
		l2.add("Ming");
		l2.add("Miso");
		l2.add("LAMQ");
		System.out.println(l2);
		System.out.println("************");
		System.out.println(l1.retainAll(l2));
		System.out.println(l2);
		l1.clear();
		System.out.println(l1);
		l2.clear();
		System.out.println(l2);
		
	}

}
