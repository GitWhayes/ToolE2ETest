

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFBAgain {
	
	@Test
	public void testCaseFB()
	{
		System.out.println("TestCase for Facebook");
		System.setProperty("webdriver.chrome.driver", "c:\\users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("hello");
		driver.findElementById("pass").sendKeys("hello");
		driver.quit();

	}
	
}