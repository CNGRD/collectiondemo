package wrapperclass;
import java.util.List;
import java.util.ArrayList;
public class GetIndex {

	public static void main(String[] args) {
		List l=new ArrayList<>();
		l.add("Raj");
		l.add("Vishnu");
		l.add("Karna");
		l.add('N');
		System.out.println(l);
		System.out.println(l.get(0));
		System.out.println(l.get(3));
	}

}
