package selenium_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Alerts {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//click on search button without entering text in search text field
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		//handle the alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Alert was handled successfully");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Alert was handled");
		

	}

}
