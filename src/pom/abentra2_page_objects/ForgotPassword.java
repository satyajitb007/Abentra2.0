package pom.abentra2_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Helper.initBrowser;

public class ForgotPassword extends initBrowser

{
	
	static By forgotPassword = By.xpath("//a[contains(@href,'/forgot_password')]");
	
	static By Email = By.xpath("//*[@id=\"mat-input-6\"]");
	
	static By SendEmailBtn = By.xpath("/html/body/my-app/ng-component/section/div/div/div/form/div[2]/button");
	
	
	public static void ForgotPassword(String Email)
	
	{
		
		WebElement clickfrgtpsswd = driver.findElement(forgotPassword);
		
		clickfrgtpsswd.click();
		
        WebElement enterEmail = driver.findElement(forgotPassword);
		
        enterEmail.sendKeys(Email);
        
        WebElement SendEmailClick = driver.findElement(forgotPassword);
		
        SendEmailClick.click();
		
		
	}

}
