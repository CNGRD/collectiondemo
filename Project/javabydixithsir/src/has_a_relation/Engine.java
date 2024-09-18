package has_a_relation;

public class Engine 
{
	private double hp;
	//getter
	double getHp()
	{
		return hp;
	}
	//setter
	void setHp(double hp)
	{
		this.hp=hp;
	}
	//constructor
	Engine()
	{
		
	}
	//constructor
	Engine(double hp)
	{
		setHp(hp);
	}

}
