package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertion {
	//@Test(priority=2)
	
	SoftAssert sa;
	
	void hardAssertion() {
		System.out.println("Testing1 .....");
		System.out.println(" Testing2 .......");
		Assert.assertEquals(1, 2);
		System.out.println("Testing1 .....");
		System.out.println(" Testing2 .......");
		//Assert.assertEquals(1, 2);
	}
	
	@Test(priority=1)
	
	void softAssertion() {
		
		//SoftAssert obj=new SoftAssert();
		sa=new SoftAssert();
		System.out.println("Testing1 .....");
		System.out.println(" Testing2 .......");
		sa.assertEquals(1, 2);
		System.out.println("Testing1 .....");
		System.out.println(" Testing2 .......");
		//Assert.assertEquals(1, 2);
		
		
		sa.assertAll();
	}


}
