package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Nithin/OneDrive/Desktop/A4-batch%20(Corporate%20Training)/emp1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("King");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("213123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/input[1]")).sendKeys("TYSS");
		driver.findElement(By.xpath("/html/body/div/input[2]")).sendKeys("Bglr");
		

	}

}

