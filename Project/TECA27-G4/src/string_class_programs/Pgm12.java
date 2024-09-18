package string_class_programs;

public class Pgm12 
{
	public static void main(String[] args) 
	{
		String s1="How are you doing";
		String[] sArr=s1.split(" ");
		for(int i=0;i<=sArr.length-1;i++)
		{
			System.out.println(sArr[i]);
			
		}
	}

}
