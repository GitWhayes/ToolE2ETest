package artIDPNBTesting;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogleSearching {
	
	@Test
	public void testCaseGoogle()
	{
		System.out.println("TestCase for Google Search Cheesecake");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElementByName("q").sendKeys("cheesecake");
		driver.quit();

	}


}
