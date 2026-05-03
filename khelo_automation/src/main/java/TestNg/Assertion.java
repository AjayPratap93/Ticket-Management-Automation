package TestNg;

import org.testng.*;
import org.testng.annotations.*;

public class Assertion {
	@Test
	void TestTitle() {
		String exp_resu="OPenCart";
		String Act_resul="OPenCart";
		
		/*
		 * if(exp_resu.equalsIgnoreCase(Act_resul)) {
		 * System.out.println("Tested passed"); } else {
		 * System.out.println("Tested failed "); }
		 */
		Assert.assertEquals(exp_resu,Act_resul );
		
	}
	
	

}
