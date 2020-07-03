package stepDefinitions;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginPageSteps extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;

	


	
@Given("user opens browser")


	public void user_opens_browser() throws InterruptedException {
	   
		TestBase.initialization();
		
	}
	
	
	
	
	
	@Given("^user opens the URL$")
	
	@Test
	public void user_opens_the_URL() throws Throwable {
	   
		TestBase.GetUrl();
		Thread.sleep(4000);
		logger.info("initialization complete");

	}

	@Then("user is on login page")
	public void user_is_on_login_page() {
		
		loginpage=new LoginPage();
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals("Cogmento CRM", title);
		logger.info("Title verified");
	}

	@Then("user enters username and password")
	public void user_enters_username_and_password() {
		loginpage=new LoginPage();
		homepage=loginpage.login(pro.getProperty("username"),pro.getProperty("password"));
		logger.info("username and password entered");
	}


	

	@Then("Validate Homepage title")
	public void validate_Homepage_title() {
	   String title2=homepage.verifyHomePageTitle();
	    Assert.assertEquals("Cogmento CRM", title2);
	    logger.info("Title of homepage verified");
	}
	
}
