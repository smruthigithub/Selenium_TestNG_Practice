package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyaccountPage {
	
	WebDriver driver;

	public MyaccountPage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	
	@FindBy(linkText = "- Edit Profile")
	private WebElement editProfile;
	
	@FindBy(linkText = "Personal Details")
	private WebElement personalDetails;
	
	@FindBy(linkText = "My Orders")
	private WebElement myOrders;
	
	@FindBy(linkText = "My Wallet")
	private WebElement myWallet;
	
	@FindBy(linkText = "My Payments")
	private WebElement myPayments;
	
	@FindBy(linkText = "Alerts & Notification")
	private WebElement alertsAndNotifications;
	
	@FindBy(linkText = "EDIT")
	private WebElement editPersonalDetails;
	
	@FindBy(id ="dk_container_id_salutation")
	private WebElement salutation;
	
	@FindBy(id = "id_first_name")
	private WebElement firstName;
	
	@FindBy(id ="id_last_name")
	private WebElement lastName;
	
	@FindBy(id = "id_email")
	private WebElement emailAddress;
	
	@FindBy(id = "datepicker")
	private WebElement dateofBirth;
	
	@FindBy(id = "id_mobile_no")
	private WebElement mobileNum;
	
	@FindBy(id = "id_phone_no")
	private WebElement landLineNum;
	
	@FindBy(id = "id_submit_edit_form")
	private WebElement saveChanges;
	
	@FindBy(linkText = "CANCEL")
	private WebElement cancelButton;

	public WebElement getSalutation() {
		return salutation;
	}

	public void setSalutation(String val) {
		this.salutation.sendKeys(val);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String val) {
		this.firstName.sendKeys(val);
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(String val) {
		this.lastName.sendKeys(val);
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String val){
		this.emailAddress.sendKeys(val);
	}

	public WebElement getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String val){
		this.dateofBirth.sendKeys(val);
	}

	public WebElement getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String val) {
		this.mobileNum.sendKeys(val);
	}

	public WebElement getLandLineNum() {
		return landLineNum;
	}

	public void setLandLineNum(String val){
		this.landLineNum.sendKeys(val);
	}

	public WebElement getEditProfile() {
		return editProfile;
	}

	public WebElement getPersonalDetails() {
		return personalDetails;
	}

	public WebElement getMyOrders() {
		return myOrders;
	}

	public WebElement getMyWallet() {
		return myWallet;
	}

	public WebElement getMyPayments() {
		return myPayments;
	}

	public WebElement getAlertsAndNotifications() {
		return alertsAndNotifications;
	}

	public WebElement getEditPersonalDetails() {
		return editPersonalDetails;
	}

	public WebElement getSaveChanges() {
		return saveChanges;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

}
