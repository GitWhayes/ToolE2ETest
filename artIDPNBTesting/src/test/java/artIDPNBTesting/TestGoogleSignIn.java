package artIDPNBTesting;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogleSignIn {
	
	@Test
	public void testCaseGoogle()
	{
		System.out.println("TestCase for Google SignIn");
		System.setProperty("webdriver.chrome.driver", "c:\\users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElementByName("q").sendKeys("cheesecake");
		driver.quit();

	}


}
