
package string_class_programs;

public class Test 
{

	public static void main(String[] args) 
	{
		String s1=new String("hi");
		String s2="hello";
		String s3="hello";
		String s4=new String("hi");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		boolean b1=s1.equals(s2);
		boolean b2=s2.equals(s3);
		System.out.println(b1);
		System.out.println(b2);
		int h1=s1.hashCode();
		int h2=s4.hashCode();
		int h3=s2.hashCode();
		int h4=s3.hashCode();
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		
	}

}
