package stepDefinitions;

import cucumber.api.java.en.Then;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class HomePageSteps extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	
	
	@Then("click the deals link")
	public void click_the_deals_link() throws InterruptedException {
		
		
		HomePage homepage=new HomePage() ;
		homepage.clickOnDealslink();
		logger.info("Deals link clicked");
		
	}
	
	@Then("click the document link")
	public void click_the_document_link() throws InterruptedException {
		HomePage homepage=new HomePage() ;
		homepage.clickOnDocumentslink();
		logger.info("Documents link clicked");
	
	}

	@Then("Logout from the application")
	public void logout_from_the_application() throws InterruptedException {
	    
		HomePage homepage=new HomePage() ;
		homepage.LogoutFromApp();
		logger.info("Log out from the application");
		
	}
}
