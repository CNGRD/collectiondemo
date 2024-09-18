package overriding_toString_equals_hashCode;

import java.util.Objects;

public class Employee 
{
	private String empId;
	private String ename;
	private double eSalary;
	public Employee(String empId, String ename, double eSalary) 
	{
		this.empId = empId;
		this.ename = ename;
		this.eSalary = eSalary;
	}
	@Override
	public String toString() 
	{
		return "Name is " + ename ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
