package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_With_Browser_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch Chrome browser
		//selenium 4.12.0 no need to download chrome driver
		//create an object of Chrome driver class
		//ChromeDriver driver=new ChromeDriver();
		
		//upcasting to webDriver
		WebDriver driver= new ChromeDriver();
		
		//browser actions or webdriver
		//navigate to url
		driver.get("https://www.google.co.in");
		String title=driver.getTitle();
		System.out.println(title);
		//gives current URL
		System.out.println("-----------------------------------");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//pagesource
		//String pageSource=driver.getPageSource();
		//System.out.println(pageSource);
		//close browser: parent window
		//driver.close();
		
		//close both parent and child window
		//driver.quit();
		//Another method to navigate to a url
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//to maximise window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
