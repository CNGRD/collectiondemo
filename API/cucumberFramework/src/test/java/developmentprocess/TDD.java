package developmentprocess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TDD 
{
	@Test
	public void tddTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//click on books link
		driver.findElement(By.partialLinkText("Books")).click();
		//click on add to cart button
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../../input")).click();
		
	}

}
