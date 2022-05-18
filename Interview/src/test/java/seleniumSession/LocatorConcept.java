package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Java_Lib\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("https://mytestingthoughts.com/Sample/home.html");


		driver.findElement(By.name("first_name")).sendKeys("Gaurav");
		driver.findElement(By.name("last_name")).sendKeys("Dabas");
		driver.findElement(By.name("inlineRadioOptions")).click();
		Select Hobbies = new Select(driver.findElement(By.id("exampleFormControlSelect2")));
		Hobbies.selectByIndex(0);
		Hobbies.selectByIndex(1);
		
		Select office = new Select(driver.findElement(By.name("department")));
		office.selectByVisibleText("MCR");
		
		driver.findElement(By.name("user_name")).sendKeys("Gauravkumardabas");
		driver.findElement(By.name("user_password")).sendKeys("Alpha@12");
		driver.findElement(By.name("confirm_password")).sendKeys("Alpha@12");
		
		driver.findElement(By.name("email")).sendKeys("test@test.com");
		driver.findElement(By.name("contact_no")).sendKeys("(615)8265412");
		driver.findElement(By.id("exampleFormControlTextarea1")).sendKeys("Enter long details to check if it works");
		
		driver.findElement(By.tagName("button")).submit();
				
		Thread.sleep(5000);
		driver.quit();

	}

}
