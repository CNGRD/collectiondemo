package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook 
{
	@Before
	public void before()
	{
		System.out.println("************************");
		System.out.println("Before method execution");
	}
	@Before("@Search")
	public void beforeSearch()
	{
		System.out.println("************************");
		System.out.println("Login code");
	}

	
	@After
	public void after()
	{
		System.out.println("************************");
		System.out.println("After method execution");
		
	}
	//@Before --> Background will execute---> then Scenario will execute --->then @After will execute
}
