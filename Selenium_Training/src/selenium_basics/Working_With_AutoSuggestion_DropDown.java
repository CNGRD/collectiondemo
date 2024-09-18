package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_AutoSuggestion_DropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
//		
//		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[contains(text(),'Build your own computer')]")).click();
		
		driver.findElement(By.name("q")).sendKeys("Puma");
		Thread.sleep(2000);
		driver.findElement(By.linkText("puma shoes men")).click();
		
		
	}

}
