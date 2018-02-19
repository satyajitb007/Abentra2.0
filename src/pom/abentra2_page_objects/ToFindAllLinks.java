package pom.abentra2_page_objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Helper.initBrowser;

public class ToFindAllLinks extends initBrowser

{
	
	static By AllCurrentLinks = By.tagName("a");
	
	
	public static void HomepageLinks()
	
	{
		
		List <WebElement> allActiveLinks = driver.findElements(AllCurrentLinks);
		
		int allLinks = allActiveLinks.size();
		
		
		
		
		
	}

}
