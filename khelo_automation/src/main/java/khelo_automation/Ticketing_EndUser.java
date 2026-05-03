package khelo_automation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ticketing_EndUser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Login as user and click in the Ticket management system
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://staging.khelouk.in/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("(//img[@alt=\"Profile\"])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Login'])[1]")).click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("9878368383");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Khelo@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Set<String> allwindow = driver.getWindowHandles();
		for(String newWindow:allwindow) {
			if(newWindow.equals(parent )) {
				driver.switchTo().window(newWindow);
			}
			
		}
		System.out.println("Switch to new tab");
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		System.out.println("come in the first ");
		driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
		driver.findElement(By.xpath("//button[@class=\"menu\"]")).click();
		driver.findElement(By.xpath("//p[text()='Ticket Booking']")).click();
		driver.findElement(By.xpath("//a[text()='Book Your Ticket']")).click();
		WebElement bookNow = driver.findElement(By.xpath("//h6[text()='Demo Event 250326']/ancestor::div[@class=\"d-flex flex-column card-body\"]/descendant::button[text()='Book Now']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// scroll to element CENTER (best practice)
		js.executeScript("arguments[0].scrollIntoView({block:'center'});", bookNow);

		Thread.sleep(1500); // IMPORTANT wait

		Thread.sleep(1000); // small wait

		bookNow.click();
		//driver.findElement(By.xpath("//div[@class=\"css-19bb58m\"]")).click();
		WebElement category = driver.findElement(By.xpath("//select[@class=\"form-select\"]"));
		Select s1=new Select(category);
		s1.selectByVisibleText("Gold");
		Thread.sleep(3000);
		WebElement f23=driver.findElement(By.xpath("//button[text()='Book Now']"));
		JavascriptExecutor js13 = (JavascriptExecutor) driver;
		js13.executeScript("arguments[0].scrollIntoView({block:'center'});", f23);

		// Wait for element
		Thread.sleep(1000);

		// Click using JS (most reliable for checkbox)
		js13.executeScript("arguments[0].click();", f23);
		f23.click();
		WebElement checkbox = driver.findElement(By.xpath("//input[@class='custom-checkbox']"));

		// Scroll to checkbox
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView({block:'center'});", checkbox);

		// Wait for element
		Thread.sleep(1000);

		// Click using JS (most reliable for checkbox)
		js1.executeScript("arguments[0].click();", checkbox);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(3000);
		System.out.println("Tickets has been booked ");
		/*
		 * driver.findElement(By.xpath("(//button[text()='Continue'])[2]")).click();
		 * Thread.sleep(3000); WebDriverWait wait = new WebDriverWait(driver,
		 * Duration.ofSeconds(20));
		 * 
		 * WebElement contact = wait.until(
		 * ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//input[@name='contact']")) );
		 * 
		 * contact.click(); contact.sendKeys("9879867686");
		 * driver.findElement(By.xpath("//div[@data-value=\"upi\"]")).click();
		 * driver.findElement(By.xpath("//input[@name=\"vpa\"]")).sendKeys("success@ybl"
		 * ); driver.findElement(By.xpath("//button[@validateform=\"true\"]")).click();
		 * driver.findElement(By.xpath("//button[text()='OK']")).click();
		 * 
		 */
	}

}
