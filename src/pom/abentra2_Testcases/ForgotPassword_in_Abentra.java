package pom.abentra2_Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.abentra2_page_objects.ForgotPassword;

public class ForgotPassword_in_Abentra extends ForgotPassword 

{
	
	@BeforeMethod
	public static void opensite() throws Exception
	
	{
		
		ForgotPassword_in_Abentra.initialize("chrome");
		
		ForgotPassword_in_Abentra.siteLoadTime();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.getTitle();
		
		driver.getCurrentUrl();
		
	}
	
	//ForgotPassword test using valid Email
	@Test(priority=1)
    public static void ValidEmailFrgtpasswd()
    
    {
		
		ForgotPassword_in_Abentra.ForgotPassword("satyajit.bose@navsoft.in");
		
    }
	
	
	@Test(priority=2)
    public static void InValidEmailFrgtpasswd()
    
    {
		
		ForgotPassword_in_Abentra.ForgotPassword("satyajit.bose@n");
		
    }
	
	@AfterMethod
	public static void closebrowser()
	
	{
		driver.close();
		
	}
	
}
