package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relative_Locators {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//search field text box
//		driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//input[@type='submit']"))).sendKeys("mobiles");
//		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.id("small-searchterms"))).click();
		
		//above() and below() the radio button
		//driver.findElement(RelativeLocator.with(By.name("pollanswers-1")).above(By.id("pollanswers-2"))).click();
		//driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.name("pollanswers-1"))).click();
		
		//near #click on register link near locator
		driver.findElement(RelativeLocator.with(By.tagName("a")).near(By.linkText("Log in"))).click();
	
	}
}











