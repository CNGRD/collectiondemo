package selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Multiple_Windows {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//Identify the parent window
		
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		
		//Execute the functionality which open child window
		driver.findElement(By.xpath("//span[contains(text(),'Grocery')]")).click();
		
		//Get all the windows opened(Identify all windows including child windows)
		
		Set<String> childWindows = driver.getWindowHandles();
		System.out.println(childWindows);
		
		//Iterate on the set of child windows using switchTo()
		for(String window:childWindows)
		{
			//switching to child window using switchTo()
			driver.switchTo().window(parentWindow);
			String title=driver.getTitle();
			System.out.println(title);
		}
		//switch back to the parent window
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
	//	driver.close();
		driver.quit();
		
	}

}
