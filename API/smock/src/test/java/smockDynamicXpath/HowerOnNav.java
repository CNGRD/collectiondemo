package smockDynamicXpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HowerOnNav 
{
	@Test
	public void startTest() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.clinique.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame("ibmOptinFrame");
		driver.findElement(By.xpath("//button[@id='dismissBtn']")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
		WebElement ele=driver.findElement(By.xpath("//div[@class='gnav-desktop-top-level-row']/child::div[@class='gnav-desktop-nav-item-group navbar-level-2-content-group']/div[@class='gnav-desktop-nav-item']/a[contains(text(),'Skincare')]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(By.xpath("//a[contains(text(),'All Skincare')]/following-sibling::a"));
		
		for(WebElement ele1:options)
		{
			System.out.println(ele1.getText());
		}
		
	}

}
