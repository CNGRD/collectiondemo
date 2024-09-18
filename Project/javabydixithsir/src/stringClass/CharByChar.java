package stringClass;

public class CharByChar {

	public static void main(String[] args) {
		String s1=new String("Enjoy");
		System.out.println(s1.length());
		for (int i = 0; i < s1.length(); i++) 
		{
			System.out.println(s1.charAt(i));
			
		}
	}

}
