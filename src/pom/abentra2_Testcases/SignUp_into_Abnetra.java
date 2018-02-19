package pom.abentra2_Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.abentra2_page_objects.AbentraSignUpFlow;

public class SignUp_into_Abnetra extends AbentraSignUpFlow

{
	
	@BeforeMethod
	public static void opensite() throws Exception
	
	{
		
		Login_to_abentra.initialize("chrome");
		
		Login_to_abentra.siteLoadTime();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.getTitle();
		
		driver.getCurrentUrl();
		
	}
	
	@Test
	public static void SignupComp()
	
	{
		
		SignUp_into_Abnetra.signUpFlowCompanyUse("wuiyoern.miyui@mailinator.com", "123456", "GEA");
		
	}
	
	
	@AfterMethod
	public static void closebrowser()
	
	{
		driver.close();
		
	}

}
