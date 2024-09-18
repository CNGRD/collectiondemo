package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_IFrames_By_Name {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/iframe.html");
		
		 Thread.sleep(2000);
		 //switch to frame by name
		 driver.switchTo().frame("frame1");
		 driver.findElement(By.linkText("Register")).click();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		 
		 driver.switchTo().parentFrame();
		 driver.findElement(By.linkText("Google")).click();

	}

}
