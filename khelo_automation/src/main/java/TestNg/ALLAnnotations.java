package TestNg;

import org.testng.annotations.*;

public class ALLAnnotations {
	
	@BeforeSuite
	void bs() {
		System.out.println("This is before suite ");
	}
	@AfterSuite
	void as() {
		System.out.println("This is after suite ");
	}
	@BeforeTest
	void bt() {
		System.out.println("This is before Test Method  ");
	}
	@AfterTest
	void at() {
		System.out.println("This is After Test Method ");
	}
	@AfterClass
	void Ac() {
		System.out.println("This is After Class method  ");
	}
	@BeforeClass
	void bc() {
		System.out.println("This is before class ");
	}
	@BeforeMethod
	void bm() {
		System.out.println("This is before method ");
	}
	@AfterMethod
	void Am() {
		System.out.println("This is After  Method  ");
	}
	
	@Test(priority=1)
	void Test1() {
		System.out.println("This is test method1");
	}
	@Test(priority=2)
	void Test2() {
		System.out.println("This is test method2");
	}


}
