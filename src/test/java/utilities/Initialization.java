package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import stepDefinitions.TestBase;

public class Initialization extends TestBase {

	
	
	public Initialization() throws InterruptedException
	{
		
			String browserName=pro.getProperty("browser");
			
			if(browserName.equals("chrome") && bak_chrome!=null)
			{
				driver=bak_chrome;
				return;
			} else if(browserName.equals("firefox") && bak_firefox!=null) {
				
				driver=bak_firefox;
				return;	
			} else if(browserName.equals("IE") && bak_IE!=null) {
			
				driver=bak_IE;
				return;
			
			}
			
			
			if(browserName.equals("chrome"))
					{
				System.setProperty("webdriver.chrome.driver",pro.getProperty("chromepath"));
				
				//System.setProperty("webdriver.chrome.driver","F://sel//Selenium//drivers//chromedriver.exe");
				driver=new ChromeDriver();
				bak_chrome=driver;
				
			logger.info(" chrome browser opened");
			
				
					}
			
		else if(browserName.equals("firefox"))
			{
				
				System.setProperty("webdriver.gecko.driver",pro.getProperty("chromepath"));
				driver=new FirefoxDriver();
				bak_firefox=driver;
				
			}
			
		else if(browserName.equals("ie"))
			{
				
				System.setProperty("webdriver.ie.driver",pro.getProperty("chromepath"));
				driver=new InternetExplorerDriver();
				bak_IE=driver;
				
			}
			
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			
			//driver.get(pro.getProperty("baseURL"));
			//logger.info("URL opened");
			//driver.get("http://demo.guru99.com/v4/index.php");
			Thread.sleep(4000);
			
			
			
		}

		
	}
	
	
	
	

