package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Using_XML_File_done_Driven {

	WebDriver driver;

	@BeforeClass
	void steup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Enter the website name ");

	}

	@Test(dataProvider = "singh")
	void login(String number,String pwd) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Login the application ");
		driver.navigate().to("https://staging.khelouk.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=\"btn p-2 border-0 bg-white\"]")).click();
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(number);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Assert.assertTrue(true);
	}

	@AfterClass
	void logout() throws InterruptedException {
		System.out.println(" logout all the application ");
		Thread.sleep(3000);
		driver.quit();

	}
	
	@DataProvider(name="singh")
	Object[][] loginThe_Data() {
		Object data [] [] = {
				{"9878368383","Khelo@123"},
				{"9878368385","Khelo@123"},
				{"9878368384","Test@123"},
				{"9878368389","Test@123"},
				
				
				
		};
		return data;
	}

}
