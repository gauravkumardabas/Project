package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Java_Lib\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get("https://www.ebay.com/");
		
		
		
	}

}
