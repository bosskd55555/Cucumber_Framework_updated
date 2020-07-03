package stepDefinitions;

import cucumber.api.java.en.Then;
import pageObjects.DocumentsPage;

public class DocumentPageSteps extends TestBase{
	
	DocumentsPage documentspage;
	
	

	@Then("user downloads the excel")
	public void user_downloads_the_excel() throws InterruptedException {
	    
		DocumentsPage documentspage=new DocumentsPage();
		documentspage.click_exports();
		documentspage.click_download();
		logger.info("Excel downloaded");
		
	}

}
