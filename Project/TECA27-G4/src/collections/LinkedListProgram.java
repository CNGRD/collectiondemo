package collections;

import java.util.LinkedList;

public class LinkedListProgram 
{
	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add(25);
		l1.add(5.6);
		l1.add('$');
		l1.add(true);
		l1.add("happy sunday");
		for(Object o1:
)
		{
			if(o1 instanceof String)
			{
				String s1=(String)o1;
				System.out.println(s1);
			}
			else if(o1 instanceof Integer)
			{
				Integer i1=(Integer)o1;
				System.out.println(i1);
			}
		}
		
		
		
	}

}
