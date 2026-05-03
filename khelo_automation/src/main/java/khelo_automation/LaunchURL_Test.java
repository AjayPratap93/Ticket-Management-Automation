package khelo_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL_Test {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * System.out.println("ajay");
		 * 
		 * //System.out.println("deepak singh ");
		 * 
		 * for( int i=0; i<=10; i++) { System.out.println(i+" is a valind number ");
		 * 
		 * }
		 */
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://staging.khelouk.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class=\"btn p-2 border-0 bg-white\"]")).click();
		
		
	}

}
