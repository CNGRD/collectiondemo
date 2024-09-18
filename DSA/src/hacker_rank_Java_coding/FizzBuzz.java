package hacker_rank_Java_coding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz 
{
	public static List<String> fizzBuzz(int n)
	{
		//declare a list of Strings to store the results
		List<String> result =new ArrayList<String>();
		
		//loop from 1 to n(inclusive)
		for(int i=1;i<=n;i++)
		{
			//check if i is divisible by both 3 and 5
			if (i%3==0 && i%5==0) 
			{
				//add "FizzBuzz" to the result list
				result.add("FizzBuzz");
				
			}
			//check if i is divisible by 3 or not
			else if(i%3==0)
			{
				result.add("Fizz");
			}
			//check if i is divisble by 5 or not
			else if(i%5==0)
			{
				result.add("Buzz");
				
			}
			else
			{
				//add the current number as string to the list
				result.add(Integer.toString(i));
			}
		}
		StringBuilder builder=new StringBuilder();
		for( String ch:result)
		{
			builder.append(ch);
		}
		String str=builder.toString();
		System.out.println(str);
		return result;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the Number");
		int num=sc.nextInt();
		
		List<String> result = fizzBuzz(num);
		
		//print the result
		for(String s:result)
		{
			System.out.println(s+" ");
		}
		
	}

}
