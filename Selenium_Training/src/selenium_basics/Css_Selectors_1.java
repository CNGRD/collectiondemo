package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selectors_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//css selector
		driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]")).sendKeys("computers");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[class=\"button-1 search-box-button\"]")).click();
		// we can write css selector like this also
		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		
	}

}
