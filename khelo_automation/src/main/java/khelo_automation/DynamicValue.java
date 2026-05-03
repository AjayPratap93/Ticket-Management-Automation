package khelo_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicValue {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=shoes+for+men&sid=osp%2Ccil&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&as-pos=1&as-type=RECENT&suggestionId=shoes+for+men%7CMen%27s+Footwear&requestId=c2f390bf-2b38-4f8b-a418-7e984d6eeed8&as-backfill=on&page=2");
		WebElement price = driver.findElement(By.xpath("//a[text()='Premium Sports,Soft Cushioned Insole, comfortable Runni...']/ancestor::div[@class=\"bLCLBY nr15la\"]/descendant::div[@class=\"hZ3P6w\"]"));
		String name=price.getText();
		System.out.println(" Price should be Print : "+name);
	
	}

}
