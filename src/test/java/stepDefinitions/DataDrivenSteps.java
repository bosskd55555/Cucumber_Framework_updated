package stepDefinitions;

import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import pageObjects.DealsPage;
import pageObjects.LoginPage;

public class DataDrivenSteps extends TestBase {
	
	LoginPage loginpage;
	DealsPage dealspage;
	

	
	/*@Then("user creates new deals of {string} and {string} and {string}")
	public void user_creates_new_deals_of_and_and(String title, String amount, String probability) throws InterruptedException {
	   
		
		DealsPage dealspage=new DealsPage();
		dealspage.new_button();
		dealspage.deals_title(title);
		dealspage.deals_amount(amount);
		dealspage.deals_probability(probability);
		dealspage.deals_save_button();
		logger.info("Deals created");
		
	}
	*/
	
	@Then("^user enters \"(.*?)\" and \"(.*?)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
	  
		loginpage=new LoginPage();
		loginpage.login(username,password);
		
	}
	
	@Then("user entering username and password")
	public void user_entering_username_and_password(DataTable credentials) {
	   
		
		
		for(Map<String, String> data:credentials.asMaps(String.class, String.class)) 
		{
			loginpage=new LoginPage();
			loginpage.login(data.get("username"),data.get("password"));
			
		}
		
		
		
	}


}
