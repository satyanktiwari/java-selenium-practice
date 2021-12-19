package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObject;

public class TestGoogleSearchPageObject {
	WebDriver driver = null;
	@BeforeTest
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	@Test
	public void testGoogleSearchPom() {
		GoogleSearchPageObject searchPageObject = new GoogleSearchPageObject(driver);
		driver.get("https://google.com");
		TestGoogleSearchPageObject.sleep(3000);
		searchPageObject.searchText("Kalimoh + youtube + karate");
		searchPageObject.sendReturnKey();
		TestGoogleSearchPageObject.sleep(3000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			System.out.println("Wait is cuasing error");
		}
	}
}
