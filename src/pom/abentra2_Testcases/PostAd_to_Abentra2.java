package pom.abentra2_Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.abentra2_page_objects.PostAdFlow;

//public class PostAd_to_Abentra2 extends PostAdFlow

public class PostAd_to_Abentra2 extends PostAdFlow

{
	@BeforeMethod
	public static void opensite() throws Exception
	
	{
		
		PostAd_to_Abentra2.initialize("chrome");
		
		PostAd_to_Abentra2.siteLoadTime();
		
		PostAd_to_Abentra2.waitForPageLoading();
		
		driver.getTitle();
		
		driver.getCurrentUrl();
		
	}
	
	
	
	
	
	
/*	@Test
	public static void postAd() throws Exception
	
	{
		PostAd_to_Abentra2.getAllParentCategory();
	
		
	}*/
	
	@Test
	public static void postAd() throws Exception
	
	{
		PostAd_to_Abentra2.getAllParentCategory();
	
		
	}


	@AfterMethod
	public static void closebrowser()
	
	{
		driver.close();
		
	}

}
