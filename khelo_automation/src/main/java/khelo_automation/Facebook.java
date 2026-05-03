package khelo_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook {

	WebDriver driver;
		@Test
		void facebook() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.facebook.com/");
		 WebElement logo = driver.findElement(By.xpath("//div[@class=\"x106a9eq\"]"));
		 boolean facebook = logo.isDisplayed();
		 Assert.assertTrue(facebook);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("9898798735");
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("Test@123");
		}
	
	
}
