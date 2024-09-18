package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions_DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		
//		//Source WebElement
//		WebElement source=driver.findElement(By.id("box3"));
//		
//		//Target WebElement
//		WebElement target=driver.findElement(By.id("box103"));
//		
//		
//		action.dragAndDrop(source,target).build().perform();

		//source web element
		WebElement rome=driver.findElement(By.id("box6"));
		
		//Target WebElement
		WebElement italy=driver.findElement(By.id("box106"));
		
		action.dragAndDrop(rome, italy).build().perform();
		
	}

}
