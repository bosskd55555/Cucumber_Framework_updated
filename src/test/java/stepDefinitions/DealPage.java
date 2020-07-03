package stepDefinitions;

import cucumber.api.java.en.Then;
import pageObjects.DealsPage;

public class DealPage extends TestBase{

	DealsPage dealspage;
	

	@Then("user creates new deals")
	public void user_creates_new_deals() throws InterruptedException {
	   
		DealsPage dealspage=new DealsPage();
		dealspage.new_button();
		dealspage.deals_title(pro.getProperty("title"));
		dealspage.deals_amount(pro.getProperty("amount"));
		dealspage.deals_probability(pro.getProperty("probability"));
		dealspage.deals_save_button();
		logger.info("Deals created");
		
	}	
	
	
	
	
}
