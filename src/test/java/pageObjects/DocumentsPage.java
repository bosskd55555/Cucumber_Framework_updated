package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.TestBase;

public class DocumentsPage extends TestBase {

	
	public  DocumentsPage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/a")
	WebElement exports_link;
	
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div[1]/div[2]/div[2]/a/i")
	WebElement download_icon;
	
	
	
	public void click_exports() throws InterruptedException
	{
		Thread.sleep(4000);
		exports_link.click();
		Thread.sleep(4000);
	}
	
	public void click_download()
	{
		
		download_icon.click();
	}
}
