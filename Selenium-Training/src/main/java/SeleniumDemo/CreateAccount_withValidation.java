package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount_withValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		//isDisplayed and isEnabled commands
		
		if(driver.findElement(By.id("email_create")).isDisplayed() && driver.findElement(By.id("email_create")).isEnabled()) {
			driver.findElement(By.id("email_create")).sendKeys("digitalcutlet1002@gmail.com");
			
			driver.findElement(By.id("SubmitCreate")).click();
		}else {
			System.out.println("Email does not exist hence comig out of the test");
			System.exit(0);
		}
		
		Thread.sleep(5000);
		
		String firstName = "Kandukuri";
		String lastName = "Smruthi";
		
		driver.findElement(By.id("id_gender2")).click();
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Kandukuri");
		
		driver.findElement(By.id("customer_lastname")).sendKeys("Smruthi");
		
		driver.findElement(By.name("passwd")).sendKeys("Lord@123");
		
		//driver.findElement(By.id("days")).sendKeys("3  ");    //normal method
		
		Select days = new Select(driver.findElement(By.name("days")));  
		days.selectByValue("7");                  //By using selectByValue
		
		Select months = new Select(driver.findElement(By.id("months")));
		months.selectByVisibleText("January ");   //By using selectByVisibleText
		
		Select year = new Select(driver.findElement(By.name("years")));
		year.selectByIndex(2);                    //By using selectByIndex
		
		driver.findElement(By.id("newsletter")).click();
		
		driver.findElement(By.id("optin")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("newsletter")).click();
		
		boolean newsletterCheckboxstatus = driver.findElement(By.id("newsletter")).isSelected(); //To check if checkbox got selected or not
		
		if(newsletterCheckboxstatus == false) {
			driver.findElement(By.id("newsletter")).click();
			
		String addfirstName = driver.findElement(By.id("firstname")).getAttribute("value");
		String addLastName = driver.findElement(By.id("lastname")).getAttribute("value");
		
		if(firstName.equals(addfirstName) && lastName.equals(addLastName)) {   //Validating first name and last name
			
			System.out.println("Provided Name is matching with Address Name");}
			else
				System.out.println("Provided Name is NOT MATCHING with Address Name");	
		
		driver.findElement(By.id("firstname")).clear();  //Updating new names
		driver.findElement(By.id("lastname")).clear();
		
		driver.findElement(By.id("firstname")).sendKeys("Smruthi");
		driver.findElement(By.id("lastname")).sendKeys("David");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("company")).sendKeys("Jesus Networks");
	
		driver.findElement(By.id("address1")).sendKeys("Kurnool");
		
		driver.findElement(By.id("city")).sendKeys("Kurnool");
		
		driver.findElement(By.id("id_state")).sendKeys("Alabama");
		
		driver.findElement(By.id("postcode")).sendKeys("12345");
		
		driver.findElement(By.id("id_country")).sendKeys("United States");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("1234567890");
		
		driver.findElement(By.id("alias")).sendKeys("Bangalore");
		
		driver.findElement(By.id("submitAccount")).click();
		
		}	
		
	}

}
