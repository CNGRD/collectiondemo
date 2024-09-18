package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Iframes {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/iframe.html");
		Thread.sleep(2000);
		
		//switch to frame by index
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		//switch back to main page
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Google")).click();
		
		
		
	}

}
