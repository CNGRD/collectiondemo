package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions_KeyBoardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		
		WebElement searchText=driver.findElement(By.id("small-searchterms"));
		//action.moveToElement(searchText).click().sendKeys("Mobiles").perform();
		
		//key up and key down 
		action.moveToElement(searchText).click()
		.keyDown(Keys.SHIFT).sendKeys("monbiles").keyUp(Keys.SHIFT).perform();

	}

}
