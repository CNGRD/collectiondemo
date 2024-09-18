package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions_ContextClick {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action=new Actions(driver);
		
		WebElement rightClick_Button=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		
		action.contextClick(rightClick_Button).build().perform();
		 
		WebElement move=driver.findElement(By.xpath("//span[text()='Copy']"));
		action.moveToElement(move).click().build().perform();

	}

}
