package pom.abentra2_page_objects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Helper.initBrowser;

public class SocialSignInOptions extends initBrowser

{
	/*@FindBy(className="btn-facebook")
	public static WebElement FacebookBtn;*/
	
	static By FacebookBtn = By.className("btn-facebook");
	
	@FindBy(id="googleBtn")
	public static WebElement GoogleBtn;

	
	
	public static void faceBookSignIn()
	
	{
		
		WebElement FacebookSignIN = driver.findElement(FacebookBtn);
		
		FacebookSignIN.click();
		
		System.out.println(FacebookSignIN.getText());
		
		Set<String> AllWindowHandles = driver.getWindowHandles();
		
		Iterator<String> wndw = AllWindowHandles.iterator();
		
		String ParentWindow = wndw.next();
		
		String ChildWindow = wndw.next();
		
		driver.switchTo().window(ChildWindow);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(ParentWindow);
		
	}
	
    /* public static void GoogleSignIn()
	
	{
		
	    GoogleBtn.click();
		
		Set<String> AllWindowHandles = driver.getWindowHandles();
		
		Iterator<String> wndw = AllWindowHandles.iterator();
		
		String ParentWindow = wndw.next();
		
		String ChildWindow = wndw.next();
		
		driver.switchTo().window(ChildWindow);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(ParentWindow);
		
	}
	*/
	
	
}
