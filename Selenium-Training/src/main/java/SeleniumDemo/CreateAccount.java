package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("kandukurismruthivm@gmail.com");
		
		driver.findElement(By.id("SubmitCreate")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("id_gender2")).click();
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Kandukuri");
		
		driver.findElement(By.id("customer_lastname")).sendKeys("Smruthi");
		
		driver.findElement(By.name("passwd")).sendKeys("Lord@123");
		
		driver.findElement(By.id("newsletter")).click();
		
		driver.findElement(By.id("optin")).click();
		
		
		
	}

}
