package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions_Scroll {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		//action.scrollByAmount(0, 800).build().perform();
		
		WebElement myAccount=driver.findElement(By.linkText("RSS"));
		action.scrollToElement(myAccount).click().build().perform();
		
		
		

	}

}
