package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// open the application 
//login the application 
// logo is not visiable 

public class OrngHRM {
	
	WebDriver driver;
	@Test(priority=1)
	void openApp (){
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test(priority=3)
	void LoginApp() {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		 
	}
	@Test(priority=2)
	void testLogo() throws InterruptedException {
		Thread.sleep(4000);
		boolean Status = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println("Logo is Displed.... :"+ Status);
		
	}
	@Test(priority=5)
	void Logout() {
		driver.quit();
		
	}
	
	
	
	
  
}
