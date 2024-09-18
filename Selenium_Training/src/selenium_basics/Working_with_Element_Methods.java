package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Element_Methods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
//		Thread.sleep(1000);
//		driver.findElement(By.id("small-searchterms")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.id("small-searchterms")).sendKeys("books");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		//WebElement Getters
//		String text=driver.findElement(By.linkText("Register")).getText();
//		System.out.println(text);
//		driver.findElement(By.id("small-searchterms")).sendKeys("books");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		Thread.sleep(2000);
//		
		//Getters
//		//get the text from the search page
//		String text1=driver.findElement(By.xpath("//h1[text()='Search']")).getText();
//		System.out.println("The text displayed is "+text1);
//		

		//Get attribute value
//		String subscribe_value=driver.findElement(By.id("newsletter-subscribe-button")).getAttribute("value");
//		System.out.println(subscribe_value);
//		
//		String textField_value=driver.findElement(By.id("small-searchterms")).getAttribute("value");
//		System.out.println(textField_value);
//		
//		driver.findElement(By.id("small-searchterms")).sendKeys("books");
//		Thread.sleep(2000);
//		String textField_val=driver.findElement(By.id("small-searchterms")).getAttribute("value");
//		System.out.println(textField_val);
		
		
		//get css value
//		String color_val=driver.findElement(By.linkText("Register")).getCssValue("color");
//		System.out.println(color_val);
//		String font_Fam=driver.findElement(By.linkText("Register")).getCssValue("font-family");
//		System.out.println(font_Fam);
//		
		
		
		//Verification very important methods isDisabled(),isDisplayed(),isSelected()
//		if(driver.findElement(By.id("small-searchterms")).isDisplayed())
//		{
//			driver.findElement(By.id("small-searchterms")).sendKeys("Books");
//			System.out.println("Search store found and text passed");
//		}
//		else
//		{
//			System.out.println("Search field not displayed");
//		}
//		
//		//check if search button is enabled or not
//		if(driver.findElement(By.xpath("//input[@type='submit']")).isEnabled())
//		{
//			driver.findElement(By.xpath("//input[@type='submit']")).click();
//			
//		}
//		else
//		{
//			System.out.println("Not enabled");
//		}
		
		//check if the radio button excellent is checked or not
		if(driver.findElement(By.id("pollanswers-1")).isEnabled())
		{
			driver.findElement(By.id("pollanswers-1")).click();
			
		}
		else
			System.out.println("Not Enabled");
				
	
		
		//driver.quit();
	
	}

}
