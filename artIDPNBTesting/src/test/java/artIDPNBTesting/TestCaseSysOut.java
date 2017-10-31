package artIDPNBTesting;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseSysOut {
	
	@Test 
	public void testSysoutTestCase()
	{
		
		// System.out.println("Failure test case");
		System.setProperty("webdriver.chrome.driver", "c:\\users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			/*invalid url
			driver.get("httwww");
			driver.quit();
			 */
		driver.get("http://www.google.com");
		driver.findElementByName("q").sendKeys("hrblock");
		driver.quit();


	}

}
