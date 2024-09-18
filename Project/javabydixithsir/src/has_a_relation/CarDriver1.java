package has_a_relation;

public class CarDriver1 {

	public static void main(String[] args) 
	{
		//Create car instance
		Car c1=new Car("Benz S series");
		//fetch and print car method name and cc
		System.out.println("Model "+c1.getModelName());
		System.out.println("HP "+c1.getEngine().getHp());
		
	}

}
