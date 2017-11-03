package artIDPNBTesting;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUdemy {

	@Test 
	public void testUdemyTestCase()
	{
		
		System.out.println("TestCase for Udemy Search");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
			driver.get("http://www.udemy.com");
		    driver.findElement(By.id("q")).clear();
		    driver.findElement(By.id("q")).sendKeys("taxes");
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    driver.quit();
		}
	
	
}
