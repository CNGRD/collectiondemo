package wrapperclass;
import java.util.List;
import java.util.ArrayList;
public class Remove1 {

	public static void main(String[] args) {
		List l=new ArrayList<>();
		l.add("Arjun");
		l.add("Prabhas");
		l.add("Jackie");
		l.add("Dboss");
		System.out.println(l);
		l.remove(0);
		System.out.println(l);

	}

}
