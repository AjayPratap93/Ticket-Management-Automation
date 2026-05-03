package TestNg;

import org.testng.annotations.Test;

public class SignupTests {
	
	
	@Test(priority=1,groups= {"Regression"})
	void signupbyEmail() {
		System.out.println("This is Signup by email ");
	}
	@Test(priority=2,groups= {"Regression"})
	void SignupbyFacebook() {
		System.out.println("This is Signup by facebook");
	}
	@Test(priority=2,groups= "Regression")
	void SignupbyTwitter() {
		System.out.println("This is Signup by Twitter");
	}

	
}
