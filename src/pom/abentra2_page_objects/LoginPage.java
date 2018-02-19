package pom.abentra2_page_objects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Helper.initBrowser;

public class LoginPage extends initBrowser

{
	
	/*//Constructor
	public LoginPage(WebDriver driver)
	
	{
		
		PageFactory.initElements(driver, this);
		
	}*/
	
	//Element and locator of login button
	//static By createYourAdBtnClick = By.cssSelector("#navbarSupportedContent > ul > li.nav-item.active > a");
 
	static By createYourAdBtnClick = By.xpath("//a[@href='/postad']");
	
	//Element and locator of email field
	static By email = By.xpath("id(\"mat-input-0\")");
		
	//Element and locator of password field
	static By password = By.xpath("id(\"mat-input-1\")");
	
	//Element and locator of login click field
	static By loginclick = By.xpath("/html/body/my-app/ng-component/section/div/div/div/form/div[1]/div[1]/div/div[4]/button");
	
	public static void CreateAdClick()
	
	{
		
		try
		{
			WebElement createAdClick = driver.findElement(createYourAdBtnClick);
			createAdClick.click();
						
			System.out.println("CreateAd button clicked");
			
			String beforeloginUrl = driver.getCurrentUrl();
			System.out.println("after clicking on Create Ad: "+beforeloginUrl);
			//System.out.println("message "+driver.getPageSource().contains("Log In"));
		}
		
		 catch (Exception e) {
	            e.printStackTrace();
	        }
		
		
		
	}
	
	
	//login to the Abentra site
	
		public static void logintogtfs(String Username, String Password) 
		
		{
			WebElement enteremail = driver.findElement(email);
			enteremail.sendKeys(Username);
			System.out.println("Username is entered");
			
			WebElement enterpassword = driver.findElement(password);
			enterpassword.sendKeys(Password);
			System.out.println("password is entered");
			
			WebElement signin = driver.findElement(loginclick);
			signin.click();
			
			
			String expectedLoginURL = "https://frontend.abentra.com/dashboard";
			
			WebDriverWait wait = new WebDriverWait(driver, 50);		
			boolean islogInURLCorrect = wait.until(ExpectedConditions.urlToBe(expectedLoginURL));
			
			assertTrue(islogInURLCorrect, expectedLoginURL);
			
			islogInURLCorrect=true;
			
			String afterloggedinUrl = driver.getCurrentUrl();
			System.out.println("after logged in: "+afterloggedinUrl);
			System.out.println("Signed in");
			
			//System.out.println("message "+driver.getPageSource().contains("Feeds"));
			//Boolean status = false;
			
			/*if(status.equals(1))
				
			{
				status = true;
				System.out.println("login success "+driver.getCurrentUrl());
				
			}
			Assert.assertTrue(status, "login failed");*/
			
			
		}
	
}