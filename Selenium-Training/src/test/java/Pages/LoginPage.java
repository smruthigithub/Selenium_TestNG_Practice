package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }

	@FindBy(linkText = "Login/Sign Up")
	private WebElement loginBtn;
	
	@FindBy(id = "otpEmail")
	private WebElement enterPhoneNum;
	
	@FindBy(xpath = "//button[@class='btn btn-default login-btn']")
	private WebElement continueBtn;
	
	//After entering OTP
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg login-btn fixed-btn']")
	private WebElement verifyNcontinueBtn;
	
	@FindBy(linkText = "BigBasketeer")
	private WebElement afterSignIn;

	public WebElement getEnterPhoneNum() {
		return enterPhoneNum;
	} 

	public void setEnterPhoneNum(String val) {
		this.enterPhoneNum.sendKeys(String.valueOf(val));
		
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getVerifyNcontinueBtn() {
		return verifyNcontinueBtn;
	}

	public WebElement getAfterSignIn() {
		return afterSignIn;
	}
}
