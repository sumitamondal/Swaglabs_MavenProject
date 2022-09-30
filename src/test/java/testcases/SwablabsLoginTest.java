package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pages.LoginPage;

public class SwablabsLoginTest extends BaseClass{

	@Test
	public void Test1() {
	
		System.out.println("Inside the positive test");
		LoginPage lp=new LoginPage(driver);
		lp.Login("standard_user","secret_sauce");
		
	}

	
	@Test
	public void Test2() {
	
		System.out.println("Inside the negetive test");
		LoginPage lp=new LoginPage(driver);
		lp.Login("abcd_efg","master_kgp");
		
		
		//Step6: Error messege vallidation
		
				WebElement Error =driver.findElement(By.xpath("//h3[@data-test="error"]"));
				
				String ActError=Error.getText();
				String ExpError="Epic sadface: Username and password do not match any user in this service";
				
				Assert.assertTrue(Error.isDisplayed());
				Assert.assertEquals(ActError,ExpError);
	}
}