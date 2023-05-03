package testscript;



import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Fetch_data;
import Generic.Generic_class;
import Pom.POm;



public class Login_script extends Generic_class
{
	@Test
	public void test1()
	{
		String un= Fetch_data.get_data("Sheet1",0,0);
		String pwd=Fetch_data.get_data("Sheet1",0,1);
		POm p = new POm(driver);
		p.username(un);
		Assert.fail();
		p.password(pwd);
		p.login_btn();
	}

}
