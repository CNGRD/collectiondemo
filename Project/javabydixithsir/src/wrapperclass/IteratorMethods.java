package wrapperclass;
import java.util.Iterator;
import java.util.List;
import java.lang.Iterable;
import java.util.ArrayList;
public class IteratorMethods {

	public static void main(String[] args) {
		List l=new ArrayList<>();
		l.add(123);
		l.add("Raj");
		l.add("RAM");
		System.out.println(l);
		System.out.println("***************");
		Iterator i=l.iterator();
		while(i.hasNext())
		{
		 System.out.println(i.next());
		}

	}

}
