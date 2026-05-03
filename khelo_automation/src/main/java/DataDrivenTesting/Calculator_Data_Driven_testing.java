package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator_Data_Driven_testing {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		FileInputStream file = new FileInputStream(
				"C:\\Users\\Ajay Pratap\\eclipse-workspace\\khelo_automation\\testData\\Calculator.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		int cell = sheet.getRow(1).getLastCellNum();
		System.out.println(row + " " + cell);
		WebElement Deposit = driver.findElement(By.xpath("//input[@formcontrolname=\"cdAmount\"]"));
		WebElement month = driver.findElement(By.xpath("//input[@id=\"mat-input-1\"]"));
		WebElement rate = driver.findElement(By.xpath("//input[@id=\"mat-input-2\"]"));
		WebElement Cou = driver.findElement(By.id("mat-mdc-form-field-label-3"));
		WebElement click = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		for (int i = 1; i <= row; i++) {
			String Deposite = sheet.getRow(i).getCell(0).toString();
			String months = sheet.getRow(i).getCell(1).toString();
			String Rate = sheet.getRow(i).getCell(2).toString();
			String cou = sheet.getRow(i).getCell(3).toString();
			String Click = sheet.getRow(i).getCell(4).toString();
			String Actule = sheet.getRow(i).getCell(5).toString();
			Thread.sleep(5000);
			Deposit.clear();
			Deposit.sendKeys(Deposite);
			Thread.sleep(3000);
			month.clear();
			month.sendKeys(months);
			Thread.sleep(3000);
			rate.clear();
			rate.sendKeys(Rate);
			Thread.sleep(3000);
			Cou.click();
			WebElement new12 = driver.findElement((By.xpath("//span[text()=' Compounded Monthly ']")));
			new12.click();
			click.click();
			Thread.sleep(3000);
			
			WebElement expected = driver.findElement(By.xpath("//span[@id=\"displayTotalValue\"]"));
			  String Expected=expected.getText();
			
			if(Double.parseDouble( Actule) == Double.parseDouble(Expected)) {
				System.out.println("Test is passed");
			}
			else {
				System.out.println("failed ");
			}
		}
	}

}
