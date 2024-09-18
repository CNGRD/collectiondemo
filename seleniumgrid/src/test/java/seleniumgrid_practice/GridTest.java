package seleniumgrid_practice;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest
{
	@Test
	public void sampleTest() throws MalformedURLException, URISyntaxException
	{
		URL url=new URI("http://localhost:4444").toURL();
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.MAC);
		RemoteWebDriver driver=new RemoteWebDriver(url,cap);
		driver.get("http://gmail.com");
	}

}
