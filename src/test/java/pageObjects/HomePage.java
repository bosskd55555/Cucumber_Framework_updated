package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.TestBase;

public class HomePage extends TestBase {

	public HomePage() {
		
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/a[3]/span")
	WebElement contacts;
	

	@FindBy(xpath="//*[@id=\"main-nav\"]/a[5]/span")
	WebElement deals;


	@FindBy(xpath="//*[@id=\"main-nav\"]/a[6]/span")
	WebElement tasks;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/a[9]/span")
	
	WebElement documents;
	
	
	
	@FindBy(xpath="//*[@id=\"top-header-menu\"]/div[3]/div[2]/div/i")
	WebElement Logout_icon;
	
	@FindBy(xpath="//*[@id=\"top-header-menu\"]/div[3]/div[2]/div/div[2]/a[5]/span")
	WebElement Logout;
	
	
	public String verifyHomePageTitle()
	{
		
		return driver.getTitle();
	}
	
	public void clickOnNewContactslink()
	{
		
		contacts.click();
	}
	
	public void clickOnDealslink() throws InterruptedException
	{
		Thread.sleep(4000);
		deals.click();
		Thread.sleep(4000);
	}
	
	public void clickOnDocumentslink() throws InterruptedException
	{
		Thread.sleep(4000);
		documents.click();
		Thread.sleep(4000);
	}
	
	public void LogoutFromApp() throws InterruptedException
	{
		
		Thread.sleep(4000);
		Logout_icon.click();
		
		Thread.sleep(4000);
		Logout.click();
	}
	
}
