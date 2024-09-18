package array_String_programs;

public class Convert_StrArray_String {

	public static void main(String[] args) 
	{
		String[] str= {"Hi","Nithin","How","are","You"};
		StringBuilder sb=new StringBuilder();
		sb.append(str[0]);
		//converting to string
		
		for(int i=1;i<=str.length-1;i++)
		{
			sb.append(" "+str[i]);
			
		}
		String s=sb.toString();
		System.out.println(s);

	}

}
