package artIDPNBTesting;

import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestJiraWHayes {
	@Test
	public void TCWhayes()
	{
		System.out.println("TestCase for Google Search for Zephyr for JIRA");
		System.setProperty("webdriver.chrome.driver", "c:\\users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElementByName("q").sendKeys("Zephyr for Jira");
		driver.quit();

	}
}
