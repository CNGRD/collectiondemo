package has_a_relation;

public class PhoneDriver {

	public static void main(String[] args) 
	{
		Mobile m1=new Mobile();
		m1.setModelName("Samsung");
		m1.setPrice(20000);
		m1.insertSim(new Simcard(56476547,"Jio"));
		System.out.println(m1.getModelName());
		System.out.println(m1.getPrice());
		m1.getSimcard().setSim_no(45435436);
		System.out.println(m1.getSimcard().getSim_no());
		System.out.println(m1.getSimcard().getService_provider());
		
	}

}
class Simcard
{
	//non static variables
	private int sim_no;
	private String service_Provider;
	//getters
	public long getSim_no()
	{
		return sim_no;
	}
	public String getService_provider()
	{
		return service_Provider;
	}
	//setter
	public void setSim_no(int sim_no)
	{
		this.sim_no=sim_no;
	}
	public void setService_Provider(String service_Provider)
	{
		this.service_Provider=service_Provider;
	}
	//constructor
	public Simcard(int sim_no,String service_Provider)
	{
		this.sim_no=sim_no;
		this.service_Provider=service_Provider;
	}
}
//depending class
class Mobile
{
	//non static variable
	private String model_Name;
	private double price;
	//dependent class variables
	private Simcard simcard;
	//helper method to achieve lazy instantiation
	public void insertSim(Simcard simcard)
	{
		this.simcard=simcard;
	}
	//getter method to get object variable
	public Simcard getSimcard()
	{
		return simcard;
	}
	//getters and setters
	public String getModelName()
	{
		return model_Name;
	}
	public void setModelName(String model_Name)
	{
		this.model_Name=model_Name;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
}