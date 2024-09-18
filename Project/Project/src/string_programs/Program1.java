package string_programs;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.next();
		System.out.println("Enter The Charcater");
		char ch = sc.next().charAt(0);

		for (int i = 0; i <= s1.length() - 1; i++) 
		{
			if (s1.charAt(i) == ch) 
			{
				System.out.println("The Given Characer Present @" + i);
			}
		}

	}
}
