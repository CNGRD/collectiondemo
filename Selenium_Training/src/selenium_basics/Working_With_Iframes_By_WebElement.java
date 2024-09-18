package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Iframes_By_WebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/iframe.html");
		
		Thread.sleep(2000);
		
		//switch to frame by web element
		
		driver.switchTo().frame(driver.findElement(By.id("FR1")));
		
		driver.findElement(By.id("newsletter-email")).sendKeys("aaa@test.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
	}

}
