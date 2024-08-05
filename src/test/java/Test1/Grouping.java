package Test1;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(priority=1,groups= {"Sanity","Regression"})
	public void loginByEmail()
	{
		System.out.println("Login email");
	}
	
	@Test(priority=2,groups= {"Regression"})
	public void loginByFacebook()
	{
		System.out.println("Login Facebook");
	}
	
	@Test(priority=3,groups= {"Regression"})
	public void loginByTwitter()
	{
		System.out.println("Login Twitter");
	}
	@Test(priority=4,groups= {"Sanity","Regression"})
	public void signupByEmail()
	{  
		System.out.println("SignUp Email");
	}
	@Test(priority=5, groups= {"Regression"})
	public void signupByFacebook()
	{
		System.out.println("SignUp Facebook");
	}
	@Test(priority=6, groups= {"Regression"})
	public void signupByTwitter()
	{
		System.out.println("SignUp Twitter");
	}
	
	@Test(priority=7,groups= {"Sanity","Regression"})
	public void paymentInRupees()
	{
		System.out.println("payment Rupees");
	}
	@Test(priority=8, groups= {"Sanity"})
	public void paymentInDollar()
	{
		System.out.println("payment dollar");
	}
	
	@Test(priority=9, groups= {"Sanity"})
	public void paymentReturnByBank()
	{
		System.out.println("payment returnbank");
	}

}
