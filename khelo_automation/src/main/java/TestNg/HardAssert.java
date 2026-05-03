package TestNg;

import org.testng.annotations.Test;

import  org.testng.Assert;
public class HardAssert {
	@Test
	void hardAssert() {
		//Assert.assertEquals("ajay", "Ajay");
		//Assert.assertEquals(123, 123);
		
		//Assert.assertNotEquals("ajay", "Ajay");
		//Assert.assertTrue(false); false 
		//Assert.assertTrue(1==1);
		
		//
		Assert.fail();
	
	
	}

}
