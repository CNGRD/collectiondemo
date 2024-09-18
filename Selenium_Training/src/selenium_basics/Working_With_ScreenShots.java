package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_With_ScreenShots
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//Type cast to get the capabilities of TakeScreenShot interface to the driver instance
		//Typecasting
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//Temporary location
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		
		//Destination File
		File destFile=new File("./ScreenShots/HomePage.png");
		
		FileHandler.copy(srcFile, destFile);
		
		System.out.println("Home page launched Successfully");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//screen shot after clicking on search
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//ScreenShots/Searchpage.png");
		FileHandler.copy(src, dest);
		
		driver.close();
		

	}

}
