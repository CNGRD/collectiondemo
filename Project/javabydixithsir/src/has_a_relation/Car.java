package has_a_relation;

public class Car 
{
	private String modelName;
	//getter
	String getModelName()
	{
		return modelName;
	}
	//setter
	void setModelName(String modelName)
	{
		this.modelName=modelName;
	}
	//achieve Has_a Relation
	private Engine e=new Engine(1200);
	//getter
	Engine getEngine()
	{
		return e;
		
	}
	//constructor
	Car()
	{
		
	}
	//constructor with Arguments
	Car(String modelName)
	{
		this.modelName=modelName;
	}

}
