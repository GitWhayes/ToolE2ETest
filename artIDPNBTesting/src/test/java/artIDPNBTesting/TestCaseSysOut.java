package artIDPNBTesting;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseSysOut {
	
	@Test 
	public void testSysoutTestCase()
	{
		
		System.out.println("Test Google URL HRB");
	//	System.setProperty("webdriver.chrome.driver", "c:\\users\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElementByName("q").sendKeys("hrblock");
		driver.quit();


	}

}
