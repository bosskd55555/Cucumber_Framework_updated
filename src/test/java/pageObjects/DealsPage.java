package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.TestBase;

public class DealsPage extends TestBase {

	
	public DealsPage() {
		
		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")
	WebElement new_button;


	@FindBy(name="title")
	WebElement deals_title;
	
	
	@FindBy(name="amount")
	WebElement deals_amount;
	
	@FindBy(name="probability")
	WebElement deals_probability;


	@FindBy(name="commission")
	WebElement deals_commision;
	
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	
	WebElement deals_save_button;
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[3]")
	WebElement export;
	
			
	@FindBy(xpath="/html/body/div[3]/div/div[2]/button[2]")
	WebElement popup_ok;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/button[1]")
	WebElement popup_cancel;
	
	
	
	public void new_button()
	{
		
		new_button.click();
	}
	
	
public void deals_title(String dl_title)
{
	
	deals_title.sendKeys(dl_title);
}

public void deals_amount(String dl_amnt)
{
	
	deals_amount.sendKeys(dl_amnt);
}

public void deals_probability(String prob) throws InterruptedException
{
	
	deals_probability.sendKeys(prob);
	Thread.sleep(4000);
}

public void deals_commision(String comm)
{
	
	deals_commision.sendKeys(comm);
}

public void deals_save_button() throws InterruptedException
{
	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 
	 js.executeScript("window.scrollBy(0,1000)");

	 Thread.sleep(4000);
	deals_save_button.click();
	 Thread.sleep(4000);
	
	
}

	
}
