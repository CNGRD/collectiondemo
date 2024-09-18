package exceptions;

public class SalaryException extends RuntimeException
{
	//override getMessage()
	public String getMessage()
	{
		return "salary cannot be less than 0";
	}

}
