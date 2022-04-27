package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://automationpractice.com/index.php");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.navigate().back();  //To move back
		Thread.sleep(3000);
		
		driver.navigate().forward(); //To move forward
		Thread.sleep(3000);
		
		driver.findElement(By.id("email_create")).sendKeys("kandukurismruthivm@gmail.com");
		
		Thread.sleep(2000);
		driver.navigate().refresh(); //To refresh the page
		
		
	}

}
