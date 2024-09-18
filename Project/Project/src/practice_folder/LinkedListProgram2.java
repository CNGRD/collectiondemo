package practice_folder;

import java.util.LinkedList;

public class LinkedListProgram2 
{
	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		l1.add(45);
		l1.add(7.8);
		l1.add('&');
		l1.add(false);
		l1.add("Unstoppable");
		for(int i=0;i<=l1.size()-1;i++)
		{
			if(l1.get(i)instanceof String)
			{
				String s1=(String)l1.get(i);
				System.out.println(s1.length());
			}
			else if(l1.get(i)instanceof Integer)
			{
				Integer i1=(Integer)l1.get(i);
				int k=i1.intValue();
				System.out.println(k);
			}
			else if(l1.get(i)instanceof Double)
			{
				Double d1=(Double)l1.get(i);
				double d=d1.doubleValue();
				System.out.println(d);
			}
			else if(l1.get(i)instanceof Character)
			{
				Character c1=(Character)l1.get(i);
				char c=c1.charValue();
				System.out.println(c);
			}
			else if(l1.get(i) instanceof Boolean)
			{
				Boolean b1=(Boolean)l1.get(i);
				boolean b=b1.booleanValue();
				System.out.println(b);
			}
			
		}
	}


}
