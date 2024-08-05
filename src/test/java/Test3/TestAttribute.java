package Test3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAttribute {

	
	    @Test(groups="Regression")
		public void m1()
		{
			System.out.println("m1 method");
		}
		
	    @Test(groups="Smoke")
		public void m2()
		{
			Assert.assertEquals(11, 15);
		}
	    
	    @Test(groups="sanity")
		public void m3()
		{
			Assert.assertEquals(20, 20);
		}
	    @Test(groups="Smoke")
	    public void m4()
	    {
	    	Assert.assertEquals(30, 40);
	    }

	

}
