package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Locators1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//click on register link
		
		driver.findElement(By.linkText("Register")).click();
		// click on gender
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("raj");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("G R");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("test0209@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		//close the browser
		driver.quit();

	}

}
