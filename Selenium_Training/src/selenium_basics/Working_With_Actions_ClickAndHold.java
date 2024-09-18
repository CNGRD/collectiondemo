package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions_ClickAndHold {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		
		WebElement washington=driver.findElement(By.id("box3"));
		WebElement unitedStates=driver.findElement(By.id("box103"));
		
		action.clickAndHold(washington).moveToElement(unitedStates).click().build().perform();
		

	}

}
