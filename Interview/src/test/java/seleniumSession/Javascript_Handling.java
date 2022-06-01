package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Java_Lib\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();

		driver.findElement(By.name("proceed")).click();
		
		Alert alert = 	driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		
		String getText  = alert.getText();
		if (getText.equals("Please enter a valid user name test")) {
			System.out.println("valid message");
			
		} else {
			
			System.out.println("Invalid message");

		}
		
		alert.accept();
		
		
		
		Thread.sleep(2000);

		
		
		
		driver.quit();

	}

}
