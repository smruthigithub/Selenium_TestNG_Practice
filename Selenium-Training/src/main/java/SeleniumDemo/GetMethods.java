package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		//Get Methods getCurrentUrl, getTitle, getPageSource
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is " +currentUrl);
		
		String Title = driver.getTitle();
		System.out.println("Title of the page is " +Title);
		
		String pageSource = driver.getPageSource();
		System.out.println("Web page source is " +pageSource);
		
		driver.findElement(By.linkText("Sign in")).click();
		
		
	}

}
