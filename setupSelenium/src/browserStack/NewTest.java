package browserStack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.toshinnovations.com/");
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.name("tab5")).click();
		
		driver.findElement(By.id("contactForm-name")).sendKeys("Poojan");
		driver.findElement(By.id("contactForm-Email")).sendKeys("poojanrawat123@gmail.com");
		driver.findElement(By.id("contactForm-Company")).sendKeys("Infosys");
		
		driver.quit();
		
	}

}
