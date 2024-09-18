package overriding_toString_equals_hashCode;

public class MainClass2 
{
	public static void main(String[] args) 
	{
		Book book1=new Book("Shiva triology","Amish",750,1);
		Book book2=new Book("I had a Dream","Nithin",500,1);
		System.out.println("----------------------X-----------------------");
		System.out.println(book1);
		System.out.println("----------------------X-----------------------");
		System.out.println(book2);
		System.out.println("Thank you");
		System.out.println("----------------------X-----------------------");
		boolean res=book1.equals(book2);
		System.out.println(res);
		System.out.println("----------------------X-----------------------");
		int h1=book1.hashCode();
		int h2=book2.hashCode();
		System.out.println(h1);
		System.out.println(h2);
		System.out.println("----------------------X-----------------------");

	}

}
