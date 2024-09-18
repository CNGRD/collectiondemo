package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Alerts_Dismiss {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(3000);
		driver.findElement(By.name("cusid")).sendKeys("7839");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert was handled with dismiss method");
		Thread.sleep(3000);
		driver.close();
	}

}
