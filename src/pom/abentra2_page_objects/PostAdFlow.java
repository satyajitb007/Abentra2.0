package pom.abentra2_page_objects;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Helper.initBrowser;
import pom.abentra2_Testcases.Login_to_abentra;

public class PostAdFlow extends LoginPage

{
	
	//static By createAdbtn = By.xpath("//a[contains(@href,'postad')]");
	
	//static By createAdbtn = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a");
	
	/*@FindBy (className ="postadd-column")
	public static WebElement postAdcolumn;*/
	
	static By postAdcolumn = By.className("postaddcontain");

	

public static void getAllParentCategory() throws Exception

{
	PostAdFlow.CreateAdClick();
	
	PostAdFlow.logintogtfs("satyajit.bose@navsoft.in", "123456");
	
	PostAdFlow.waitForPageLoading();
	
	WebElement createAdbtnClick = driver.findElement(PostAdFlow.createYourAdBtnClick);
	createAdbtnClick.click();
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//PostAdFlow.waitForObject();
	
	//js.executeScript("arguments[0].click();",createAdbtnClick);
	//createAdbtnClick.click();
	//PostAdFlow.waitForPageLoading();
	
	//System.out.println("supposed to be landed to post Ad: "+driver.getCurrentUrl());

	List <WebElement> Catlistings = driver.findElements(postAdcolumn);
	int catlistingcount = Catlistings.size();
	
	if(catlistingcount==0)
	{
		
		System.out.println("List not found");
		
	}
	
	else
		{
	System.out.println("List found and Count Categories: "+catlistingcount);
		}
	
	String expectedText = "-CARS";
	
	for(WebElement Catelement : Catlistings)
	
	{
	/*for (int i=0; i<catlistingcount; i++)
		
	{
		String categorylistText = driver.findElements(postAdcolumn).get(i).getText();
		
		System.out.println("print all category text: "+categorylistText);*/
	
		System.out.println("print all category text: "+Catelement.getText());
	
		if(Catelement.getText().equals(expectedText))
			
		{
			
			Catelement.click();			
			//Assert.assertEquals("CARS", "CARS");
			break;
		}
		
		else
			
			System.out.println("nothing is selected");
		
		
	}
	
	
	//Random r = new Random();
	
	//Getting random value that is between 0 and listingSize
	//int getAllValues = r.nextInt(Catlistings.size());
	
	//System.out.println("print all category: "+getAllValues);
	
	//Clicking on the random item from the list
	//Catlistings.get(getAllValues).click();
	
}

}