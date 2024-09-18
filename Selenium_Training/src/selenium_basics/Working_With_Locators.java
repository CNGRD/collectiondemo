package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Locators {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		// enter the text in search text field
//		WebElement searchfield=driver.findElement(By.name("q"));
//		searchfield.sendKeys("mobiles");
		//driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		
//		WebElement searchLink=driver.findElement(By.linkText("Log in"));
	Thread.sleep(2000);
//		searchLink.click();
//		
//		driver.findElement(By.partialLinkText("Shopping")).click();
		
		//tag name locator
		//driver.findElement(By.id("newsletter-email")).sendKeys("test@123.com");
	driver.findElement(By.className("search-box-text")).sendKeys("iphone");

	}

}
