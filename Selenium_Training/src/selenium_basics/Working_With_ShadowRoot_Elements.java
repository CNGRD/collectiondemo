package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_ShadowRoot_Elements {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		Thread.sleep(5000);
		//shadow host--> Identify shadow host
		SearchContext shadow_host = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		
		shadow_host.findElement(By.cssSelector("input[type='text']")).sendKeys("Nithin");
		
		
	}	

}
