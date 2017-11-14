package artIDPNBTesting;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNielsen {

	@Test 
	public void testUdemyTestCase()
	{
		
		System.out.println("TestCase Nielsen Browser.");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
			driver.get("http://www.nielsen.com/us/en.html");
			/*
			driver.findElement(By.id("q")).clear();
		    driver.findElement(By.id("q")).sendKeys("taxes");
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    */
		    driver.quit();
		}
	
	
}
