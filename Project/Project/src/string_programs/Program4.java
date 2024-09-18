//wap to print longest substring in the given String
package string_programs;

public class Program4 
{

	public static void main(String[] args) 
	{
		String s1="I got placed in IBM";
		String[] sArr=s1.split(" ");
		String biggest=sArr[0];
		for(int i=1;i<=sArr.length-1;i++)
		{
			if(biggest==sArr[i])
			{
				System.out.println("the biggest substring is "+biggest);
			}
			else if(sArr[i]==biggest)
			{
				System.out.println(sArr[i]);
			}
		}
		
	}

}
