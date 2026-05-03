package TestNg_forAfterClass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_AfterC2 {
	
	@Test()
	void xyz() {
		System.out.println("This is xyz for C2 class");
	}
	
	@AfterTest
		void Befor() {
			System.out.println("This is After  Test method ");
		}
}
