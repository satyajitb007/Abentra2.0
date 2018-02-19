package pom.abentra2_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Helper.initBrowser;

public class AbentraSignUpFlow extends initBrowser

{
	static By JoinNow = By.xpath("//a[contains(@href,'/signup')]");
	
	static By email = By.xpath("id(\"mat-input-0\")");
	
	static By password = By.xpath("id(\"mat-input-1\")");
	
	static By CreateAccnt = By.xpath("/html/body/my-app/ng-component/section/div/div/div/form/div[1]/div[1]/div/div[4]/button");
	
	static By WelcmMessage = By.xpath("/html/body/my-app/ng-component/section/div/div/div/form/h2");
	
	static By ThisisForRadioBtn = By.xpath("/html[1]/body[1]/my-app[1]/ng-component[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]");
	
	static By Nicknamefield = By.xpath("id(\"mat-input-13\")");
	
	static By Compnamefield = By.xpath("id(\"mat-input-14\")");
	
	static By continuebtn = By.className("btn btn-default");
	
	//static String Cmptext = "Company Use";
	
	//static String PersText = "Personal Use";
	
	
	public static void signUpFlowCompanyUse(String Username, String Password, String Copmanyname)
	
	{
		
		WebElement Joinnow = driver.findElement(JoinNow);
		
		Joinnow.click();
		
		WebElement enteremail = driver.findElement(email);
		enteremail.sendKeys(Username);
		System.out.println("Username is entered");
		
		WebElement enterpassword = driver.findElement(password);
		enterpassword.sendKeys(Password);
		System.out.println("password is entered");
		
		WebElement CreateAcClick = driver.findElement(CreateAccnt);
		CreateAcClick.click();
		
		int RadioBtnCount = driver.findElements(ThisisForRadioBtn).size();
		
		System.out.println(+RadioBtnCount);
		
		for (int i=0; i<RadioBtnCount; i++)
			
		{
			
			String radioText = driver.findElements(ThisisForRadioBtn).get(i).getAttribute("value");
			System.out.println(radioText);
			
			if(radioText == "Company Use")
					
					{
				   
				driver.findElements(ThisisForRadioBtn).get(i).click();
				
				WebElement entercompname = driver.findElement(Compnamefield);
				
				entercompname.sendKeys(Copmanyname);
				
				WebElement continueclick = driver.findElement(continuebtn);
				
				continueclick.click();
				
				break;
				
					}
		}
	}
	
	
	/*public static void signUpFlowPersonalUse(String Username, String Password, String Nickname)
	
	{
		
WebElement Joinnow = driver.findElement(JoinNow);
		
		Joinnow.click();
		
		WebElement enteremail = driver.findElement(email);
		enteremail.sendKeys(Username);
		System.out.println("Username is entered");
		
		WebElement enterpassword = driver.findElement(password);
		enterpassword.sendKeys(Password);
		System.out.println("password is entered");
		
		WebElement CreateAcClick = driver.findElement(CreateAccnt);
		CreateAcClick.click();
		
		WebElement enternickname = driver.findElement(Nicknamefield);
		
		WebElement continueclick = driver.findElement(continuebtn);
		
		int RadioBtnCount = driver.findElements(ThisisForRadioBtn).size();
		
		
		
		for (int i=0; i<RadioBtnCount; i++)
			
		{
			
			String radioText = driver.findElements(ThisisForRadioBtn).get(i).getAttribute("value");
			
			if(radioText.equals(PersText))
					
					{
				   
				driver.findElements(ThisisForRadioBtn).get(i).click();
				
				enternickname.sendKeys(Nickname);
				
				continueclick.click();
				
				break;
				
					}
			
			else{
				
				
				System.out.println("not exist");
			}
		}
		
		
		
		
	}*/

}
