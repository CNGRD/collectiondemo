package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SSLogin 
{
	public WebDriver driver;
	@Given("Browser is open and url navigated")
	public void browser_is_open_and_url_navigated() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.shoppersstack.com/");
	    
	}

	@Given("Login page will be displayed")
	public void login_page_will_be_displayed() 
	{
	    driver.findElement(By.id("loginBtn")).click();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String userName, String password) 
	{
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(password);
	    
	}

	@When("clicks on login Button")
	public void clicks_on_login_button() 
	{
	    driver.findElement(By.xpath("//span[text()='Login']")).click();
	}

	@Then("Shopper should be successfully logged in")
	public void shopper_should_be_successfully_logged_in() 
	{
	    Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Hello, ')]")).isDisplayed());
	}

	@Then("Browser must be close")
	public void browser_must_be_close() 
	{
	  driver.close();
	}

	@Then("merchant should be successfully logged in")
	public void merchant_should_be_successfully_logged_in() 
	{
		System.out.println("merchant not logged in");
	    
	}

	@Then("Admin must be successfully logged in")
	public void admin_must_be_successfully_logged_in()
	{
	   Assert.assertTrue(driver.findElement(By.xpath("//h6[contains(text(),'Approved Merchants')]")).isDisplayed());
	}
	@Given("Shopper login is displayed")
	public void shopper_login_is_displayed()
	{
	    Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(text(),'Shopper')]")).isDisplayed());
	}

	@Given("Merchant login is displayed")
	public void merchant_login_is_displayed() {
	    System.out.println("Merchant login is not displayed");
	}

	@Given("Admin login is displayed")
	public void admin_login_is_displayed() {
	    System.out.println("Admin login is displayed");
	}

}
