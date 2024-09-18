package practice_folder;

import java.util.TreeSet;

public class For_each 
{
	public static void main(String[] args) 
	{
		TreeSet<String> t=new TreeSet<String>();
		t.add("hi");
		t.add("Hello");
		t.add("How");
		t.add("are");
		t.add("you");
		
		for(String rv:t)
		{
			System.out.println(t);
			
		}
	}

}
