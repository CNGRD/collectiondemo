package exceptions;

public class Employee 
{
	private String eid;
	public Employee(String eid, String ename, double sal) {
		setEid(eid);
		setName(ename);
		setSal(sal);
	}
	Employee()
	{
		
	}
	//getter
	public String getEid()
	{
		return eid;
	}
	//setter
	public void setEid(String eid)
	{
		this.eid=eid;
	}
	private String ename;
	//getter
	public String getName()
	{
		return ename;
	}
	//setter
	public void setName(String ename)
	{
		this.ename=ename;
	}
	private double sal;
	//getter
	public double getSal()
	{
		return sal;
	}
	//setter
	public void setSal(double sal)
	{
		if(sal>0)
		{
			this.sal=sal;
		}
		else
		{
			throw new SalaryException();
		}
	}

}
