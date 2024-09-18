package selenium_basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Multiple_Windows1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Facebook")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Set<String> childWindows = driver.getWindowHandles();
		
		for (String str: childWindows) 
		{
			driver.switchTo().window(parentWindow);
			if(driver.getTitle().contains("Facebook"))
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='email'])[2]")).sendKeys("raj@gmail.com");
				driver.close();
			}
			
		}
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
