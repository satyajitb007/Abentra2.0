package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

public class initBrowser {
	
	public static WebDriver driver = null;
	
	/*@BeforeTest
	@Parameters("Browser")*/
	
	public static void initialize(String browser) throws Exception
	
	{
		//Creating the file object
		
		File file = new File("C:\\Users\\Satyajit\\workspace\\Abentra2.0\\src\\Abentra2.0_initBrowser.properties");
		//file.createNewFile();
	//Creating properties object
		
		Properties prop = new Properties();
		
		// Creating InputStream object to read data
		FileInputStream objInput = null;
		
		try
		{
			objInput = new FileInputStream(file);
			
			//Reading properties key/values in file
			prop.load(objInput);
			
			//Closing the InputStream
			objInput.close();
			
		} catch (FileNotFoundException e) {
		     System.out.println(e.getMessage());   
		     
		    } catch (IOException e) {
		   System.out.println(e.getMessage());
		  }
		
		System.out.println(browser);
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			
		}
		
		else if(browser.equalsIgnoreCase("FF"))
			
		{
			
			System.setProperty("webdriver.gecko.driver", "E:\\GeckoDriver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().deleteAllCookies();
			
		}
		
		else
			
		{
			
			System.setProperty("webdriver.ie.driver","D://IEDriverServer.exe");
			
			  driver = new InternetExplorerDriver();
			  driver.manage().deleteAllCookies();
		
			
		}
		
		driver.get(prop.getProperty("Abentra2.0.URL"));
		
		driver.manage().window().maximize();
		
		Reporter.log("Browser is up and running");
		
		
	}
	
	public static void siteTimedoutException()
	
	{
		
		WebDriverWait wait = new WebDriverWait(driver,500);
		
		
	
		
	}
	
	//To measure page load time
	public static void siteLoadTime()
	
	{
		
		long startTime = System.currentTimeMillis();
		
		long finishTime = System.currentTimeMillis();
		
		long pageLoadTime = startTime - finishTime;
		
		System.out.println(+pageLoadTime);
		
	}
	
   public static void waitForObject()
   {
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
   public static void waitForPageLoading()
   {
		
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	}

   
   public static void scrollingToBottomofAPage() 
   
   {

		 ((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
   
   public static void waitForAlert(WebDriver driver) throws InterruptedException
   {
      int i=0;
      while(i++<5)
      {
           try
           {
               Alert alert = driver.switchTo().alert();
               alert.getText();
               System.out.println( alert.getText());
               Reporter.log(alert.getText());
               alert.accept();
               break;
           }
           catch(NoAlertPresentException e)
           {
             Thread.sleep(1000);
             continue;
           }
      }
   }
}
