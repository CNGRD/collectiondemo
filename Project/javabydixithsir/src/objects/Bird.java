package objects;

public class Bird {
	String color,name,family,kingdom,clas;
	Bird()
	{
		
	}
	Bird(String color)
	{
		this.color=color;
		System.out.println("Color of bird :"+color);
	}
	Bird(String color,String name)
	{
		this.color=color;
		this.name=name;
		System.out.println("Color of Bird :"+color);
		System.out.println("Name of the Bird :"+name);
	}
	Bird(String color,String name,String family)
	{
		this.color=color;
		this.name=name;
		this.family=family;
		System.out.println("Color of the Bird :"+color);
		System.out.println("Name of the Bird :"+name);
		System.out.println("Family of the Bird :"+family);
	}
	Bird(String color,String name,String family,String kingdom)
	{
		this.color=color;
		this.name=name;
		this.family=family;
		this.kingdom=kingdom;
		System.out.println("Color of the Bird :"+color);
		System.out.println("Name of the Bird :"+name);
		System.out.println("Family of the Bird :"+family);
		System.out.println("Bird Kingdom :"+kingdom);
	}
	Bird(String color,String name,String family,String kingdom,String clas)
	{
		this.color=color;
		this.name=name;
		this.family=family;
		this.kingdom=kingdom;
		this.clas=clas;
		System.out.println("Color of the Bird :"+color);
		System.out.println("Name of the Bird :"+name);
		System.out.println("Family of the Bird :"+family);
		System.out.println("Bird Kingdom :"+kingdom);
		System.out.println("Bird class :"+clas);
	}
}
