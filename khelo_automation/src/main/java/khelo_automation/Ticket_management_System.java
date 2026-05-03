package khelo_automation;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ticket_management_System {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Login as admin and click in the Ticket management system
		driver.get("https://staging-admin.khelouk.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("ukadmin@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		WebElement Ticketsmanagermant = driver.findElement(By.xpath("//span[text()='Ticket Management System']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", Ticketsmanagermant);
		Ticketsmanagermant.click();
		Thread.sleep(2000);
		WebElement Ticketsmanagermant1 = driver.findElement(By.xpath("//a[text()='Ticket Management System']"));
		js.executeScript("arguments[0].scrollIntoView(true)", Ticketsmanagermant1);
		// driver.findElement(By.xpath("//span[text()='Ticket Management
		// System']")).click();
		Ticketsmanagermant1.click();
		Thread.sleep(5000);
		// Click in the Ticketing
		driver.findElement(By.xpath("//button[@data-slot=\"sidebar-menu-button\"]")).click();

		// Create Event
		driver.findElement(By.xpath("//span[text()='Create Event']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter event title\"]")).sendKeys("Khelo_tech");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//textarea[@rows=\"4\"])[1]")).sendKeys("Sports games");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)");
		WebElement image = driver.findElement(By.xpath("//input[@type=\"file\"]"));
		// image.click();
		String name = image.getText();
		//System.out.println(name);
		;
		Thread.sleep(300);
		File f = new File("C:\\Users\\Ajay Pratap\\Downloads\\Grand.png");
		// image.sendKeys("");
		System.out.println(f.exists());
		// image.sendKeys("C:\\\\Users\\\\Ajay Pratap\\\\Downloads\\\\Grand.png");
		// System.out.println("Success");
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(5000);
		// select Cluster
		driver.findElement(By.xpath("//span[text()='Select cluster']")).click();
		String ClusterName = "New Venue name";
		List<WebElement> cluster = driver.findElements(
				By.xpath("//div[@class=\"cursor-pointer rounded px-2 py-1.5 text-sm hover:bg-gray-100\"]"));//// div[@id=\
																											//// "radix-«r1»\"]
																											//// List<WebElement>
																											//// cluster1
																											//// =
		System.out.println(" Total Cluster count " + cluster.size());
		for (WebElement singh : cluster) {
			String n = singh.getText();
			// System.out.println(n);
			if (n.equalsIgnoreCase(ClusterName)) {
				singh.click();
				break;
			}

		}
		// Select Venue
		// driver.findElement(By.xpath("((//div[@class=\"cursor-pointer rounded px-2
		// py-1.5 text-sm hover:bg-gray-100\"])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Select venue']")).click();
		List<WebElement> venue = driver.findElements(
				By.xpath("//div[@class=\"cursor-pointer rounded px-2 py-1.5 text-sm hover:bg-gray-100\"]"));
		System.out.println(" Total venue count " + venue.size());
		String venueName = "New Testing";
		for (WebElement Venues : venue) {
			if (Venues.getText().equalsIgnoreCase(venueName)) {
				Venues.click();
				break;
			}

		}
		// Select Zone
		Thread.sleep(2000);
		String ZoneNAme = "zone1";
		driver.findElement(By.xpath("//span[text()='Select zone(s)']")).click();
		List<WebElement> Zone = driver.findElements(By.xpath(
				"//div[@class=\"flex cursor-pointer items-center gap-2 rounded px-2 py-1.5 hover:bg-gray-100\"]"));
		System.out.println(" Total Zone count " + Zone.size());
		for (WebElement zones : Zone) {
			if (zones.getText().equalsIgnoreCase(ZoneNAme)) {
				zones.click();
				break;
			}
		}
		// Select when Event will be start
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Address']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@data-slot=\"input\"])[2]")).sendKeys("New Delhi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='dd-mm-yyyy'])[1]")).click();
		WebElement StartDate = driver.findElement(By.xpath("//button[text()='18']"));
		StartDate.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='dd-mm-yyyy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name=\"next-month\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='18']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Select time'])[1]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.xpath("//button[text()='10:00']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Select time']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='18:00']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='dd-mm-yyyy'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='15']")).click();
		
		driver.findElement(By.xpath("//button[text()='dd-mm-yyyy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name=\"next-month\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='17']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Select time'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='08:00']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Select time']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='16:00']")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		// If i will create a free event
		driver.findElement(By.xpath("//button[text()='Free']"));
		// driver.findElement(By.xpath("//input[@placeholder=\"e.g.
		// Gold\"]")).sendKeys("VIP Sheet");
		// driver.findElement(By.xpath("//input[@placeholder=\"Enter
		// quantity\"]")).sendKeys("12");
		// driver.findElement(By.xpath("(//textarea[@placeholder=\"Type
		// here\"])[2]")).sendKeys("Best of luck ");
		// If i want to create Paid Event
		driver.findElement(By.xpath("//button[text()='Paid']")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"e.g. Gold\"]")).sendKeys("VVIP Sheet");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter quantity\"]")).sendKeys("10");
		WebElement Price = driver.findElement(By.xpath("//input[@placeholder=\"Enter price\"]"));
		Price.clear();
		Thread.sleep(2000);
		Price.sendKeys("2000");
		driver.findElement(By.xpath("(//textarea[@placeholder=\"Type here\"])[2]")).sendKeys("Best of luck ");
		// driver.findElement(By.xpath("//button[text()='Save']")).click();
		// driver.findElement(By.xpath("//button[text()='Cancel']")).click();

		// Come in the user side then book the tickets
		Thread.sleep(1000);
		// Login as user and click in the Ticket management system
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
				// open new tab
				((JavascriptExecutor) driver).executeScript("window.open('https://www.khelouk.in/','_blank');");
				String parent = driver.getWindowHandle();
				// wait (important)
				Thread.sleep(3000);
				// switch to user tab
				Set<String> allwindow = driver.getWindowHandles();
				

				for (String newWindow : allwindow) {
				    if (!newWindow.equals(parent)) {
				        driver.switchTo().window(newWindow);
				        break;
				    }
				}

				// verify
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.xpath("(//img[@alt=\"Profile\"])[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//span[text()='Login'])[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("7600162281");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Khelo@123");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()='Login']")).click();
				Thread.sleep(2000);
				
				Thread.sleep(3000);
				Set<String> allWindows = driver.getWindowHandles();
				Thread.sleep(2000);

				for (String window : allWindows) {
				    driver.switchTo().window(window);

				    String currentURL = driver.getCurrentUrl();
				    //System.out.println("Checking URL: " + currentURL);

				    Thread.sleep(2000);
				    // ✅ ONLY switch to USER main site
				    if (currentURL.contains("khelouk.in") 
				            && !currentURL.contains("admin") 
				            && !currentURL.contains("event-booking")) {

				        //System.out.println("✅ Switched to USER TAB: " + currentURL);
				        break;
				    }
				}
				//System.out.println("Now working on: " + driver.getCurrentUrl());
				//System.out.println("come in the first ");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class=\"menu\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//p[text()='Ticket Booking']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()='Book Your Ticket']")).click();
				Thread.sleep(2000);
				JavascriptExecutor js1=(JavascriptExecutor) driver;
				js1.executeScript("window.scrollBy(0,600)");
				WebElement bookNow = driver.findElement(By.xpath("//h6[text()='Demo title Event']/ancestor::div[@class=\"d-flex flex-column card-body\"]/descendant::button[text()='Book Now']"));

				JavascriptExecutor js12 = (JavascriptExecutor) driver;

				// scroll to element CENTER (best practice)
				js12.executeScript("arguments[0].scrollIntoView({block:'center'});", bookNow);

				Thread.sleep(1500); // IMPORTANT wait

				Thread.sleep(1000); // small wait

				bookNow.click();
				WebElement category = driver.findElement(By.xpath("//select[@class=\"form-select\"]"));
				Select s1=new Select(category);
				Thread.sleep(2000);
				s1.selectByVisibleText("Gold");
				Thread.sleep(2000);
				WebElement f23=driver.findElement(By.xpath("//button[text()='Book Now']"));
				JavascriptExecutor js13 = (JavascriptExecutor) driver;
				js13.executeScript("arguments[0].scrollIntoView({block:'center'});", f23);

				// Wait for element
				Thread.sleep(1000);

				// Click using JS (most reliable for checkbox)
				js13.executeScript("arguments[0].click();", f23);
				//f23.click();
				Thread.sleep(2000);
				WebElement checkbox = driver.findElement(By.xpath("//input[@class='custom-checkbox']"));
				
				// Scroll to checkbox
				JavascriptExecutor js14 = (JavascriptExecutor) driver;
				js14.executeScript("arguments[0].scrollIntoView({block:'center'});", checkbox);

				// Wait for element
				Thread.sleep(1000);

				// Click using JS (most reliable for checkbox)
				js14.executeScript("arguments[0].click();", checkbox);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()='Continue']")).click();
				
				driver.findElement(By.xpath("//button[text()='Yes']")).click();
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,800)");
				System.out.println("Tickets has been created ");
				//driver.findElement(By.xpath("//input[@name=\"contact\"]")).sendKeys("9879867686");
				//driver.findElement(By.xpath("//div[@data-value=\"upi\"]")).click();
				//driver.findElement(By.xpath("//input[@name=\"vpa\"]")).sendKeys("success@ybl");
				//driver.findElement(By.xpath("//button[@validateform=\"true\"]")).click();
				//driver.findElement(By.xpath("//button[text()='OK']")).click();
	
	}

}
