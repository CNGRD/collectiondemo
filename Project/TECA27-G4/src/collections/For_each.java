package collections;

import java.util.TreeSet;

public class For_each 
{
	public static void main(String[] args) 
	{
		TreeSet<String> s=new TreeSet<String>();
		s.add("apple");
		s.add("Orange");
		s.add("Lemon");
		s.add("Grapes");
		s.add("water melon");
		for(String s1:s)
		{
			System.out.println(s1);
		}
		
	}

}
