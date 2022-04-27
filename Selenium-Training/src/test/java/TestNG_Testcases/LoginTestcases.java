package TestNG_Testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;

public class LoginTestcases extends TestBase {
	
	@Test
	public void loginTest001() throws InterruptedException {
		
		homePageObj.getSignIn().click();
		loginObj.setEnterPhoneNum("8247378070");
		loginObj.getContinueBtn().click();
		
		Thread.sleep(15000);
		loginObj.getVerifyNcontinueBtn().click();
				
		Assert.assertEquals(loginObj.getAfterSignIn().isDisplayed(), true);

		System.out.println("LoginTest001 is PASS");
	}

}
