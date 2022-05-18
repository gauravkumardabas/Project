package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Java_Lib\\chromedriver\\chromedriver.exe");
		// set property
		WebDriver driver = new ChromeDriver();
		// Call driver

		driver.manage().window().maximize();
		// maximize windows

		driver.manage().deleteAllCookies();
		// delete all cookies

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// Page out Timeout

		driver.get("https://www.google.com/");

		// driver.get("https://www.instagram.com/?hl=en");
		// set URL

		String name = driver.getTitle();
		// extract title
		System.out.println(name);
		// Validation steps
		if (name.equals("Google")) {

			System.out.println("Correct");

		} else {
			System.out.println(" Incorrect");
		}

		System.out.println(driver.getCurrentUrl());

		Thread.sleep(2000);

		driver.quit();

	}

}
