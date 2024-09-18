package wrapperclass;
import java.util.*;

public class ForEachLoop {

	public static void main(String[] args) {
		List l=new ArrayList<>();
		l.add("Anjal");
		l.add("Bangude");
		l.add("Pamplet");
		l.add("Catla");
		System.out.println(l);
		for (Object o: l) 
		{
			System.out.println(o);
		}
	}

}
