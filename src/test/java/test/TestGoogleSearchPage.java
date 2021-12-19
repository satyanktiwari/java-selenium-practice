package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class TestGoogleSearchPage {
	WebDriver  driver = null;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void testGoogleSearchPage() {
		driver.get("https://google.com");
		GoogleSearchPage.searchText(driver)
		.sendKeys("kalimoh + youtube + karate"+Keys.RETURN);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Error due to thread sleep used after "
					+"clicking search button");
		}
//		GoogleSearchPage.clickSearchButton(driver)
//		.sendKeys(Keys.RETURN);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			System.out.println("Error due to thread sleep used after "
//					+"clicking search button");
//		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
