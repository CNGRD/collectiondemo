package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Preceding_sibling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Nithin/OneDrive/Desktop/A4-batch%20(Corporate%20Training)/emp1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[2]/preceding-sibling::input")).sendKeys("nithin");
		driver.findElement(By.xpath("(//input)[1]/following-sibling::input")).sendKeys("test@123");
		driver.findElement(By.xpath("//div/input[1]")).sendKeys("TYSS");
		driver.findElement(By.xpath("//div/input[1]/following-sibling::input")).sendKeys("bengalore");
	}

}

