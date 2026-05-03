package khelo_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DateChange {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get("https://demoqa.com/date-picker");
		selectDate(driver,"19/11/2022");
		
		
	}
	public static void selectDate(WebDriver driver, String requeridate) throws InterruptedException {

		
		
		 WebElement date = driver.findElement(By.xpath("//input[@id=\"datePickerMonthYearInput\"]"));
		 Thread.sleep(3000);
		date.click();
		Thread.sleep(2000);
		date.sendKeys(Keys.CONTROL+" a");
		Thread.sleep(2000);
		date.sendKeys(requeridate);
		Thread.sleep(2000);
		date.sendKeys(Keys.ENTER);
		WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id=\"datePickerMonthYearInput\"]")).click();
		WebElement years =wait.until(ExpectedConditions.visibilityOfElementLocated(((By.xpath("//select[@class=\"react-datepicker__year-select\"]")))));
		Select year=new Select(years);
		year.selectByVisibleText("2022");
		WebElement months = wait.until(ExpectedConditions.visibilityOfElementLocated(((By.xpath("//select[@class=\"react-datepicker__month-select\"]")))));
		Select month =new Select(months);
		month.selectByVisibleText("November");
		System.out.println("Succes date");
		 String day = "11";
	        //WebElement date = driver.findElement(By.xpath( "//div[contains(@class,'react-datepicker__day') and text()='" + day + "']"));
	        date.click();
	        System.out.println("date selected succesful ");
	        System.out.println("Parihar");
	}
		
	
}
