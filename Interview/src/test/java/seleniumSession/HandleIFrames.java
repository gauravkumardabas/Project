package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Java_Lib\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("http://demo.guru99.com/test/guru99home/");

		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(" Total frames are " + size);

		for (int i = 0; i < size; i++) {
			driver.switchTo().frame(i);

			System.out.println(driver.findElement(By.tagName("iframe")).getAttribute("id"));

		}

//		driver.switchTo().frame("a077aa5e");
////		driver.switchTo().defaultContent();
//
//		driver.findElement(By.xpath("/html/body/a")).click();
//		
//		
//		driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent();
//	

		Thread.sleep(3000);
		driver.close();
	}

}
