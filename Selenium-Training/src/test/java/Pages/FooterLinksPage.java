package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterLinksPage {
	
	WebDriver driver;

	public FooterLinksPage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	
	@FindBy(linkText = "About Us")
	private WebElement aboutUs;
	
	@FindBy(linkText = "In News")
	private WebElement inNews;
	
	@FindBy(linkText = "Contact Us")
	private WebElement contactUs;
	
	@FindBy(linkText = "Terms and Conditions")
	private WebElement termsAndConditions;

	public WebElement getAboutUs() {
		return aboutUs;
	}

	public WebElement getInNews() {
		return inNews;
	}

	public WebElement getContactUs() {
		return contactUs;
	}

	public WebElement getTermsAndConditions() {
		return termsAndConditions;
	}

}
