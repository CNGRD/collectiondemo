package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_Select_Class {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		Thread.sleep(2000);
		WebElement options = driver.findElement(By.id("dropdown"));
		Thread.sleep(2000);
		//create an object of Select class
		Select objSel=new Select(options);
		Thread.sleep(2000);
		//Select by Visible Text
		objSel.selectByVisibleText("Option 1");
		Thread.sleep(2000);
		//select by value
		objSel.selectByValue("2");
		
		//select by index
		objSel.selectByIndex(1);
	
		
	}

}
