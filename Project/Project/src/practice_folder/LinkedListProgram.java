package practice_folder;

import java.util.LinkedList;

public class LinkedListProgram 
{
	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add(78);
		l1.add(5.6);
		l1.add('@');
		l1.add(true);
		l1.add("Hi");
		System.out.println(l1);
		String s1=(String) l1.get(4);
		System.out.println(s1);
		Integer i1=(Integer)l1.get(0);
		System.out.println(i1);
		
	}

}
