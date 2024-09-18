package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_Select_Class2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cardekho.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@data-lazy='true'])[1]")).click();	
		
		
		
		

	}

}
