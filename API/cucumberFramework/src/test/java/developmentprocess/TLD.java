package developmentprocess;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TLD
{
	@Test
	public void tldTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		//Assert.assertTrue(driver.getTitle().contains("Tricentis Demo Web Shop"));
		
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input")).click();
		//Assert.assertTrue(driver.findElement(By.className("content")).getText().contains("The product has been added to your "));
		
		driver.close();
		
	}

}
