package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrmgHRM {
	
	// open the application 
	//logo is visiable
	// login the application
	//close the app 
	WebDriver driver;
	@Test(priority=1)
	 void openApp() {
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		 
	 }
	@Test(priority=2)
	void logo() throws InterruptedException {
		Thread.sleep(4000);;
		 WebElement  Status = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]"));
		 String Logo = Status.getText();
		 System.out.println("Logo "+ Logo);
		 System.out.println("Status is displeyed.....+"+Status.isDisplayed());
	}
	//@Test(priority=3)
	void login() {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	//@Test(priority=4)
	 void closeApp() {
		driver.quit();
	}
	
}
