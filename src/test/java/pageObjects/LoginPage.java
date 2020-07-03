package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.TestBase;




	public class LoginPage extends TestBase{
		
		
		
		
		
		public LoginPage() {
			
			
			PageFactory.initElements(driver,this);
			logger.info("Login page driver initialized");
		}

		
		
		@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")
		WebElement txtUsername;
		

		@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")
		WebElement txtPassword;


		@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
		WebElement btnLogin;
		
		@FindBy(xpath="/html/head/title")
		WebElement title;
		
		
		
		public HomePage login(String un,String pw)
		{
			txtUsername.sendKeys(un);
			txtPassword.sendKeys(pw);
			
			btnLogin.click();
			
			return new HomePage();
			
			
		}
		
		
	
	
	public String validateLoginPageTitle()
	{
		
		 
				//String titlec=title.getText().toString();
				//return titlec;
		
		return driver.getTitle();
				
	}
	

}

	

