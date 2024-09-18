package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Relative_Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
//		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		
//		driver.findElement(By.xpath("//a[text()='Register']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Log in']")).click();
//		driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]")).sendKeys("computers");
//		driver.findElement(By.xpath("(//input[contains(@class,'button')])[1]")).click();
		
		//driver.findElement(By.xpath("(//a[starts-with(text(),'Electronics')])[1]")).click();
//		driver.findElement(By.xpath("//input[starts-with(@name,'News')]")).sendKeys("raj@gmail.com");
//		driver.findElement(By.xpath("//input[starts-with(@value,'Subscribe')]")).click();
		
		//ends-with
		//driver.findElement(By.xpath("//input[@type='button' and @id='vote-poll-1']")).click();
		driver.findElement(By.xpath("//span[@class='cartlabel' or text()='Shopping cart']")).click();
	}

}
