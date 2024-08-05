package Test3;

import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void APILoginCarloan()
	{
		System.out.println("Weblogin");
	}
	@Test(groups= {"Smoke"})
	public void mobileCarloan()
	{
		System.out.println("mobileLogin");
	}
	@Test
	public void APILogin()
	{
		System.out.println("API Login");
	}

}
