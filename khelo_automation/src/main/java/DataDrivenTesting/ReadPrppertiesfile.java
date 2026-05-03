package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPrppertiesfile {
	public static void main(String[] args) throws IOException, InterruptedException {
		Properties p1 = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir" )+ "\\testData\\Confrig.Properties");
		p1.load(file);
		String URL = p1.getProperty("appURL");
		String email = p1.getProperty("email");
		String password = p1.getProperty("password");
		System.out.println(URL + " " + email + " " + " " + password);
		Set<String> Keys = p1.stringPropertyNames();
		String name="email";
		for(String ke:Keys) {
			System.out.println(ke);
			
		}
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get(URL);
		Thread.sleep(5000);

	}

}
