package Test2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(groups= {"Smoke"})
	public void m1()
	{
		System.out.println("This is m1 method");
	}
	
	@Test()
	public void m2()
	{
		System.out.println("This is m2 method");
	}
	
	@Test()
	public void m3()
	{
		Assert.assertEquals(11, 11);
	}

}
