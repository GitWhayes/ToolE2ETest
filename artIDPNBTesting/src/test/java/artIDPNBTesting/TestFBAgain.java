package artIDPNBTesting;


import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFBAgain {
	
	@Test
	public void testCaseFB()
	{
		System.out.println("\n\n***TestCase for Facebook");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println("Title of web page is: " + driver.getTitle());
		driver.findElementById("email").sendKeys("hello");
		driver.findElementById("pass").sendKeys("hello");
		driver.quit();

	}
	
}