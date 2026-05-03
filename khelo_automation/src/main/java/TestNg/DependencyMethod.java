package TestNg;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {

	WebDriver driver;
	@Test(priority = 1)
	void OpenApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://staging-admin.khelouk.in/");
		Assert.assertTrue(true);
	}
	@Test(priority = 2, dependsOnMethods = { "OpenApp" })
	void loginapp() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement Logo = driver
				.findElement(By.xpath("//img[@src=\"/static/media/jharkhandlogo1.0f0f80e43938dfd25327.png\"]"));
		boolean Uttrakhand = Logo.isDisplayed();
		System.out.println("Logo is displayed : " + Uttrakhand);
		WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		email.click();
		email.sendKeys("ukadmin@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		pass.click();
		pass.sendKeys("Admin@123");

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Assert.assertTrue(true);

	}

	@Test(priority = 3, dependsOnMethods = { "loginapp" })
	void searcapp() {
		System.out.println("Searc the application ...");
		Assert.assertTrue(true);
	}

	@Test(priority = 4, dependsOnMethods = { "searcapp" })
	void logout() {
		System.out.println("Logout the application ");
		Assert.assertTrue(true);
	}

}
