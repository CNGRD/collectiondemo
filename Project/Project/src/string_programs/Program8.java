//String pgm to reverse the string word by word
package string_programs;

public class Program8 
{
	public static String reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		return rev;
	}

	public static void main(String[] args) 
	{
		String s1="java sql html jdbc";
		String[] sArr=s1.split(" ");
		String s2="";
		for(int i=0;i<=sArr.length-1;i++)
		{
			if(i!=sArr.length-1)
			{
				s2=s2+reverse(sArr[i])+" ";
			}
			else
			{
			 s2=s2+reverse(sArr[i]);
			}
		}
		System.out.println(s2);

	}

}
