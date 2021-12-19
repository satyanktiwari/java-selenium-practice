package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	WebDriver driver = null;

	public GoogleSearchPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	By search_text_box= By.name("q");
	// button does not work as it is hidden
	By search_button = By.name("btnK");

	public void searchText(String text) {
		driver.findElement(search_text_box)
		.sendKeys(text);
	}
	
	public void sendReturnKey() {
		driver.findElement(search_text_box)
		.sendKeys(Keys.RETURN);
	}
	


}
