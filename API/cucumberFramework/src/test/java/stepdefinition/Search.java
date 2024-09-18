package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search 
{
	WebDriver driver;
	public String searchItem;
	@Given("Welcome page is displayed")
	public void welcome_page_is_displayed() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	    driver.get("https://demowebshop.tricentis.com/");
	}

	@When("^user enters \"([^\"]*)\" in search text field$")//or regex we can use instead of {String} 
	//to read heterogeneous data regex exp: \"([^\"]*)\"
	public void user_enters_in_search_text_field(String searchItem) 
	{
		this.searchItem=searchItem;
	    driver.findElement(By.id("small-searchterms")).sendKeys(searchItem);
	    driver.findElement(By.xpath("//input[@value='Search']")).click();
	}

	@Then("Search results must be displayed")
	public void search_results_must_be_displayed() 
	{
		Assert.assertTrue(driver.findElement(By.name("Q")).getAttribute("value").contains(searchItem));
	    driver.quit();
	}

}
