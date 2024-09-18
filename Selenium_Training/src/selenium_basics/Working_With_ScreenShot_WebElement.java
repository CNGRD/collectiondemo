package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;




public class Working_With_ScreenShot_WebElement {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searchText=driver.findElement(By.id("small-searchterms"));
		WebElement searchbtn=driver.findElement(By.xpath("//input[@class='button-1 search-box-button']"));
		searchText.sendKeys("mobiles");
		searchbtn.click();
		
		
		//Typecasting
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile= ts.getScreenshotAs(OutputType.FILE);
		
		
		File destFile = new File("./ScreenShots/searchField.png");
		
		FileHandler.copy(srcFile, destFile);
		
		System.out.println("ScreenShot on the WebElement searchtext field was successfull");
		
		searchbtn=driver.findElement(By.xpath("//input[@class='button-1 search-box-button']"));
		File sre=searchbtn.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/searchbtn.png");
		FileHandler.copy(sre, dest);
		
		driver.close();
		
		
	}

}
