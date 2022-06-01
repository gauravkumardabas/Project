package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webdriver_Practice {
//Date Practice - 24-05-22
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Lib\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
//		driver.get("https://mytestingthoughts.com/Sample/home.html");
//		
//		System.out.println(driver.getTitle());
//		
//		driver.findElement(By.name("first_name")).sendKeys("Gaurav");
//		driver.findElement(By.id("inlineRadioFemale")).click();
//		Select hobbies = new Select(driver.findElement(By.id("exampleFormControlSelect2")));
//		hobbies.selectByIndex(2);
//		
//		Select office  = new Select(driver.findElement(By.name("department")));
//		office.selectByVisibleText("Accounting Office");
		
//		Google search navigation transition
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Facebook");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.linkText("Log In")).click();
//		Google search navigation transition		
		
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
