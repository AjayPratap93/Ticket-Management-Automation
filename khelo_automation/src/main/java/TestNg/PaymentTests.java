package TestNg;

import org.testng.annotations.Test;

public class PaymentTests {
	@Test(priority=1,groups= {"Sanity","Regression","Functional"})
		void PaymentInRuppes() {
			System.out.println("Payment is rupees");
		}
	@Test(priority=2,groups= {"Sanity","Regression","Functional"})
		void PaymentIndoller() {
			System.out.println("Payment is doller ");
		}
}
