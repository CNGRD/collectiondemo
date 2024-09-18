package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_Select_Class1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//click on books
		
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(2000);
		
		//sort by drop down 
		WebElement sort=driver.findElement(By.id("products-orderby"));
		
		Select objSel=new Select(sort);
		System.out.println(objSel.isMultiple());
	
	
	
	
	
	
	
	
	
	
	
	
	
//		objSel.selectByVisibleText("Price: Low to High");
//		
//		Thread.sleep(2000);
//		//display as drop down 
//		WebElement display = driver.findElement(By.id("products-pagesize"));
//		
//		Select objSel1=new Select(display);
//		objSel1.selectByVisibleText("12");
//		
//		Thread.sleep(2000);
		
		//view as drop down
//		WebElement view=driver.findElement(By.id("products-viewmode"));
//		
//		Select objSel2=new Select(view);
//		objSel2.selectByIndex(1);
		
		//get options method
		
//		List<WebElement> sortByOpt = objSel.getOptions();
//		
//		//iterate on  the list to print the values
//		for (WebElement ele : sortByOpt) 
//		{
//			System.out.println(ele.getText());
//			
//		}
//		System.out.println("***********************************************");
//		WebElement display=driver.findElement(By.id("products-pagesize"));
//		Select objSel1=new Select(display);
//		List<WebElement> sortByopt1 = objSel1.getOptions();
//		
//		for (WebElement ele: sortByopt1) 
//		{
//			System.out.println(ele.getText());
//			
//		}
//		
//		System.out.println("***********************************************");
//		
//		WebElement grid=driver.findElement(By.id("products-viewmode"));
//		Select objSel2=new Select(grid);
//		List<WebElement> grid_val = objSel2.getOptions();
//		
//		for (WebElement ele : grid_val) 
//		{
//			System.out.println(ele.getText());
//			
//		}

		
		

	}

}
