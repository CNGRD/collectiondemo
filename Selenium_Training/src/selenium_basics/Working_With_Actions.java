package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//create an object of action class
		
		Actions action=new Actions(driver);
		
		//move to element
		WebElement computers=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		action.moveToElement(computers).build().perform();
		
		Thread.sleep(2000);
		
		WebElement desktops=driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
		action.moveToElement(desktops).click().build().perform();

	}

}
