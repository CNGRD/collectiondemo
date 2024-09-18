package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Cursor1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> n=new ArrayList<Integer>();
		n.add(30);
		n.add(56);
		n.add(45);
		n.add(89);
		n.add(34);
		System.out.println(n);
		Iterator<Integer> i1=n.iterator();
		Integer a=i1.next();
		System.out.println(a);
		Integer r=i1.next();
		System.out.println(r);
		Integer r1=i1.next();
		System.out.println(r1);
		Boolean b=i1.hasNext();
		System.out.println(b);
		Boolean b1=i1.hasNext();
		System.out.println(b1);
		
	}

}
