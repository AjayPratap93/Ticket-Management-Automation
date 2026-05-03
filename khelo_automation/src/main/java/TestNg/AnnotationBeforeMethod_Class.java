package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Login the application @beforeMethod
// Serach the application  @ test 
// logout the application 
// login the application 
// search in the advence     @test 
// logout the application @Aftermethod

public class AnnotationBeforeMethod_Class {
	
	@BeforeMethod
	void login() {
		System.out.println(" login the ......");
	}
	@AfterMethod
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
