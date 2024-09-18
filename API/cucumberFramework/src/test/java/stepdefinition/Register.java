package stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register 
{
	WebDriver driver;
	Random rand=new Random();
	int ra=rand.nextInt(1000);
	@Given("Browser is open")
	public void browser_is_open()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	    
	}

	@Given("url is navigated to register page")
	public void url_is_navigated_to_register_page() 
	{
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Register")).click();
	    
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials(DataTable dataTable) 
	{
		List<List<String>> data = dataTable.asLists();
		driver.findElement(By.xpath("//input[@value='"+data.get(0).get(0)+"']")).click();
	    
		driver.findElement(By.id("FirstName")).sendKeys(data.get(0).get(1)+ra);
		driver.findElement(By.id("LastName")).sendKeys(data.get(0).get(2));
		
		driver.findElement(By.id("Email")).sendKeys(data.get(0).get(3)+ra+"3@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys(data.get(0).get(4));
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data.get(0).get(4));
		
		
	}
	
	
	
	
//	@When("user enters valid credentials")
//	public void user_enters_valid_credentials() {
//	    driver.findElement(By.id("gender-male")).click();
//	    driver.findElement(By.id("FirstName")).sendKeys("NITHIN"+ra);
//	    driver.findElement(By.id("LastName")).sendKeys("Rai");
//	    driver.findElement(By.id("Email")).sendKeys("nithinrai."+ra+"3@gmail.com");
//	    driver.findElement(By.id("Password")).sendKeys("rmg123");
//	    driver.findElement(By.id("ConfirmPassword")).sendKeys("rmg123");
//	}

	@When("clicks on register button")
	public void clicks_on_register_button() 
	{
		driver.findElement(By.id("register-button")).click();
	    
	}

	@Then("new account should be created")
	public void new_account_should_be_created() 
	{
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).isDisplayed());
		
	}

	@Then("Browser must be closed")
	public void browser_must_be_closed() {
	    driver.close();
	}

}
