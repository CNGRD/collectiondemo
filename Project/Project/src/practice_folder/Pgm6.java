package practice_folder;

public class Pgm6 
{

	public static void main(String[] args) 
	{
		String s1="I got job in ORACLE";
		String[] sArr=s1.split(" ");
		int maxLength=sArr.length;
		String maxString=sArr[0];
		for(int i=0;i<=sArr.length-1;i++)
		{
			if(sArr[i].length()>maxLength)
			{
				maxLength=sArr[i].length();
				maxString=sArr[i];
			}
		}
		System.out.println("Given String is::"+s1);
		System.out.println("Longest String is:: "+maxString);
	}

}
