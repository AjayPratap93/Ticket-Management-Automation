package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDcakculater {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.findElement(By.xpath("//button[@id=\"wzrk-cancel\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testData\\Data Testing .xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int totalrow = sheet.getLastRowNum();
		int totalCell = sheet.getRow(1).getLastCellNum();
		// System.out.println("Total row count :"+ totalrow);
		// System.out.println("Total cell count : "+ totalCell);
		DataFormatter formatter = new DataFormatter();
		for (int i = 1; i <= totalrow; i++) {
			// read data from the excel
			String princile = formatter.formatCellValue(sheet.getRow(i).getCell(0));
			String rate = formatter.formatCellValue(sheet.getRow(i).getCell(1));
			String Period1 = formatter.formatCellValue(sheet.getRow(i).getCell(2));
			String Period2 = formatter.formatCellValue(sheet.getRow(i).getCell(3));
			String frequency = formatter.formatCellValue(sheet.getRow(i).getCell(4));
			String sheet_Acctule = formatter.formatCellValue(sheet.getRow(i).getCell(5));
			// pass above data form application
			driver.findElement(By.xpath("//input[@name=\"principal\"]")).sendKeys(princile);
			driver.findElement(By.xpath("//input[@id=\"interest\"]")).sendKeys(rate);
			driver.findElement(By.xpath("//input[@id=\"tenure\"]")).sendKeys(Period1);
			WebElement dropdown = driver.findElement(By.xpath("//select[@name=\"tenurePeriod\"]"));
			Select drop = new Select(dropdown);
			drop.selectByVisibleText(Period2);
			Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@id=\"frequency\"]")));
			dropdown2.selectByVisibleText(frequency);
			driver.findElement(By.xpath("//a[@onclick=\"return getfdMatVal(this);\"]")).click();
			WebElement application_acctule = driver.findElement(By.xpath("//span[@id=\"resp_matval\"]//strong"));
			String actule = application_acctule.getText();
			if (Double.parseDouble(sheet_Acctule) == Double.parseDouble(actule)) {
				System.out.println("Test Passed ");
				sheet.getRow(i).createCell(7).setCellValue("PASS");
			} else {
				System.out.println("Test failed ");
				sheet.getRow(i).createCell(7).setCellValue("Fail");
			}
			driver.findElement(By.xpath("//img[@class=\"PL5\"]")).click();
		}
	}

}
