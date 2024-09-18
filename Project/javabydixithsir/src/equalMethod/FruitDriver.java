package equalMethod;

public class FruitDriver {

	public static void main(String[] args) 
	{
		Fruit f1=new Fruit("Apple","red");
		Fruit f2=new Fruit("Apple","green");
		System.out.println(f1.equals(f2));
	}

}
