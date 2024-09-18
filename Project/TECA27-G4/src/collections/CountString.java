package collections;

import java.util.HashMap;

public class CountString 
{
	public static void main(String[] args) 
	{
		String s="I love my Nation";
		String[] s1=s.split(" ");
		HashMap<String,Integer> h1=new HashMap<String,Integer>();
		int a=0;
		for(int i=0;i<s1.length;i++)
		{
			if(h1.containsKey(s1[i]))
			{
				int count=h1.get(s1[i]);
				h1.put(s1[i],count+1);
				a++;
			}
			else
				
				
			{
				h1.put(s1[i],1);
				a++;
			}
		}
		System.out.println(h1);
		System.out.println("Number of words count is :"+a);
	}

}
