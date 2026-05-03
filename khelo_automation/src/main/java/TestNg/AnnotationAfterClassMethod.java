package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// Login the application @beforeClass
// search the application  @ test 
// search in the advance     @test 
// logout the application @AfterClass

public class AnnotationAfterClassMethod {
	
	@BeforeClass
	void login() {
		System.out.println(" login the ......");
	}
	@AfterClass
	void logout() {
		System.out.println(" logout  the application  ......");
	}
	@Test(priority=1)
	void search() {
		System.out.println("  Search Application  ......");
	}
	@Test(priority=2)
	void AdvenceSearch() {
		System.out.println(" Advence Search ......");
	}
	
	
	

}
