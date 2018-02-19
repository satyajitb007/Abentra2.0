package pom.abentra2_Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.abentra2_page_objects.SocialSignInOptions;

public class SocialLogin_to_Abentra extends SocialSignInOptions

{
	
	
	@BeforeMethod
	public static void opensite() throws Exception
	
	{
		
		SocialLogin_to_Abentra.initialize("chrome");
		
		SocialLogin_to_Abentra.siteLoadTime();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.getTitle();
		
		driver.getCurrentUrl();
		
	}
	
	@Test
	public static void loginThroughFacebook()
	
	{
		
		SocialLogin_to_Abentra.faceBookSignIn();
		
	}
	
	/*@Test(priority=2)
	public static void loginThroughGoogle()
	
	{
		
		SocialLogin_to_Abentra.GoogleSignIn();
		
	}*/
	
	@AfterMethod
	public static void closebrowser()
	
	{
		driver.close();
		
	}
	
	

}
