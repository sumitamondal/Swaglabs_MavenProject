package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver driver;
	
	//-------------Objects-------------------
	
	//@FindBy(linkText = "Log in")
	//WebElement LoginLink;

	@FindBy(id ="user-name")
	WebElement UserName;
	
	@FindBy(id ="password")
	WebElement Password;
			
	@FindBy(id="login-button")
	WebElement LoginBtn;
	
/*	@FindBy(xpath="//h3[@data-test='error']")
	*/WebElement ErrorMsg;
	
	public LoginPage(WebDriver basedriver) {
		this.driver=basedriver;
		PageFactory.initElements(basedriver, this);
	}
	
	
	//---------------------Methods----------------------
	
	public void Login(String UserNameVal, String PassVal) {
	
				
		//step2: Enter Username
				UserName.sendKeys(UserNameVal);
				
		// Step3: Enter Password
				Password.sendKeys(PassVal);
									
		//Step5: Click Login Button
				LoginBtn.click();
				
				
	}
}
