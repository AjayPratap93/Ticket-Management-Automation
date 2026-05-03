package TestNg_forAfterClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_BeforeC1 {
	
	@Test()
	void abc() {
		System.out.println("This is abc for C1 class");
	}
	@BeforeTest
		void Befor() {
			System.out.println("This is BeforeTest method ");
		}
}
