package practice_folder;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram3 
{
	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add(67);
		l1.add("Break the resistance");
		l1.add(5.6);
		l1.add(true);
		l1.add('#');
		l1.add(true);
		Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			if(i1.next() instanceof String)
			{
				String s1=(String)i1.next();
				System.out.println(s1.length());
			}
			else if(i1.next() instanceof Integer)
			{
				Integer a=(Integer)i1.next();
				System.out.println(a);
			}
			else if(i1.next() instanceof Double)
			{
				Double d=(Double)i1.next();
				System.out.println(d);
			}
			else if(i1.next() instanceof Character)
			{
				Character c=(Character)i1.next();
				System.out.println(c);
			}
			else if(i1.next() instanceof Boolean)
			{
				boolean b1=(Boolean)i1.next();
				System.out.println(b1);
			}
		}
		
	}

}
