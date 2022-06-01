package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Java_Lib\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("http://automationpractice.com/index.php");

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"))).build().perform();
		
		Thread.sleep(2000);

		driver.findElement(By.linkText("T-shirts")).click();

		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}
