package practice_folder;

public class String_Class_Methods 
{

	public static void main(String[] args) 
	{
		String s1= "hi";
		int len=s1.length();
		System.out.println(len);
		System.out.println("*******************************");
		String myStr="hello my dear students";
		System.out.println(myStr.indexOf("m"));
		System.out.println("********************************");
		char  s2=s1.charAt(0);
		System.out.println(s2);
		System.out.println("*********************************");
		String s3="Jspiders";
		String res=s3.replace("J","Q");
		System.out.println(res);
		System.out.println("**********************************");
		String s4="PRACTICE MAKES MAN PERFECT";
		String res1=s4.toLowerCase();
		System.out.println(res1);
		System.out.println("***********************************");
		String s5="practice makes women perfect";
		String res2=s5.toUpperCase();
		System.out.println(res2);
		System.out.println("***********************************");
		String s6="HI";
		String s7=" HELLO HOW ARE YOU";
		String res3=s6.concat(s7);
		System.out.println(res3);
		
		
		
		
	}

	
	

}
