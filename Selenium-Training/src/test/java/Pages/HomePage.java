package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	
	@FindBy(id = "input")
	private WebElement searchTextBox;
	
	@FindBy(xpath = "//button[@class='btn btn-default bb-search']")
	private WebElement searchButton;
	
	@FindBy(linkText = "Login/Sign Up")
	private WebElement signIn;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle meganav-shop']")
	private WebElement shopBycat;
	
	@FindBy(linkText = "OFFERS")
	private WebElement offers;
	
	@FindBy(xpath = "//a[@class='bb-storedesktop-link']")
	private WebElement bbSpeciality;
	
	@FindBy(linkText = "My Basket")
	private WebElement myBasket;
	
	@FindBy(xpath = "//span[contains(text(),'Your basket is empty. Start shopping now!')]")
	private WebElement mybasketText;
	

	public WebElement getSearchTextBox() {
		return searchTextBox;
	}

	public void setSearchTextBox(String val) {
		this.searchTextBox.sendKeys(val);
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getShopBycat() {
		return shopBycat;
	}

	public WebElement getOffers() {
		return offers;
	}

	public WebElement getBbSpeciality() {
		return bbSpeciality;
	}

	public WebElement getMyBasket() {
		return myBasket;
	}

	public WebElement getMybasketText() {
		return mybasketText;
	}
	
	
}
