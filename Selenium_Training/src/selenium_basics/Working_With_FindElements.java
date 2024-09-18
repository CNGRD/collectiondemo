package selenium_basics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_FindElements
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	
		Thread.sleep(2000);
		
		//working with findElements()
//		List<WebElement> rad_Buttons = driver.findElements(By.xpath("//li[@class='answer']"));
//		for (WebElement ele : rad_Buttons) 
//		{
//			System.out.println(ele.getText());
//		}
		
		//ankle tags
//		List<WebElement> links = driver.findElements(By.xpath("//a"));
//		//iterate over links
//		for (int i = 0; i<=links.size()-1;i++) 
//		{
//			String linktext=links.get(i).getText();
//			System.out.println(linktext);
//			
//			
//		}
		//getAttribute()-iterate over links
//		List<WebElement> links = driver.findElements(By.xpath("//a"));
//		for (WebElement ele : links) 
//		{
//			String att_val=ele.getAttribute("href");
//			System.out.println(att_val);
//		}
		
		//take Radio buttons
		List<WebElement> rad_but = driver.findElements(By.xpath("//input[@type='radio']"));
		
		//iterate
		for (WebElement ele: rad_but) 
		{
			Thread.sleep(2000);
			ele.click();
			System.out.println(ele.isSelected());
			
		}
		
		

	}

}
