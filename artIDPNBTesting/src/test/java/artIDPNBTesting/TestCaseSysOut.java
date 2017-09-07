package artIDPNBTesting;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseSysOut {
	
	@Test 
	public void testSysoutTestCase()
	{
		
		System.out.println("TestCase for just Search");
		System.setProperty("webdriver.chrome.driver", "c:\\users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
			driver.get("http://www.");
		    driver.findElement(By.id("q")).clear();

	}

}
