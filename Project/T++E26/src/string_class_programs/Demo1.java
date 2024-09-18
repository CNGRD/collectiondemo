package string_class_programs;


public class Demo1 
{
	public static void main(String[] args)
	{
		String s1=new String("hii");
		String s2=new String("bye");
		System.out.println(s1);
		System.out.println(s2);
		boolean b=s1.equals(s2);
		System.out.println(b);
		int i1=s1.hashCode();
		System.out.println(i1);
		int i2=s2.hashCode();
		System.out.println(i2);
		}

}
