package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_With_Synchronisation {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//Thread.sleep(3000);//these are the hard coded waits

		WebElement searchtxt = driver.findElement(By.id("small-searchterms"));
		
		//WebdriverWait is nothing but the Explicit wait
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(searchtxt));
		

		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Thread.sleep(2000);//these are the hard coded waits means mandatory wait with given duration
		
		
		WebElement searchpage = driver.findElement(By.xpath("//h1[text()='Search']"));
		
		//Synchronization point for search text
		wait.until(ExpectedConditions.visibilityOf(searchpage));
		
		driver.quit();
		
	}

}
