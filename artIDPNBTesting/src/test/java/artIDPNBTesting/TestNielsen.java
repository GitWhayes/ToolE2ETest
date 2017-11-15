package artIDPNBTesting;

import org.junit.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNielsen {

	@Test 
	public void testUdemyTestCase()
	{
		
		System.out.println("\n\n***TestCase Nielsen Browser.");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
			driver.get("http://www.nielsen.com/us/en.html");
		    driver.quit();
		}
	
	
}
