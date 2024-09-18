package wrapperclass;
import java.util.List;
import java.util.ArrayList;
public class Remove {

	public static void main(String[] args) {
		List l=new ArrayList<>();
		l.add("Raj");
		l.add("Ram");
		l.add("Dboss");
		System.out.println(l);
		l.remove("Raj");
		System.out.println(l);

	}

}
