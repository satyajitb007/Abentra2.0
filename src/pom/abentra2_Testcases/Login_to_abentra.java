package pom.abentra2_Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.abentra2_page_objects.LoginPage;

public class Login_to_abentra extends LoginPage

{


	/*public Login_to_abentra(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}*/

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
	public static void loginToSite()
	
	{
        
		Login_to_abentra.CreateAdClick();
		
		Login_to_abentra.logintogtfs("satyajit.bose@navsoft.in", "123456");	
		
	}
	
	@AfterMethod
	public static void closebrowser()
	
	{
		driver.close();
		
	}
	


}
