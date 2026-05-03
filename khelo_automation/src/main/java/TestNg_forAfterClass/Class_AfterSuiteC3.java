package TestNg_forAfterClass;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class_AfterSuiteC3 {
	@Test()
	void kmn() {
		System.out.println("This is kmn for C3 class");
	}
	
	@AfterSuite
		void After() {
			System.out.println("This is AfterSuite method ");
		}
	@BeforeSuite
	void Befor() {
		System.out.println("This is BeforeSuite method ");
	}


}
