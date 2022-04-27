package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Ex_And {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		//Types of Xpaths
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.xpath("//input[@class='is_required validate account_input form-control' and @id='email']")).sendKeys("digitalcutlet5@gmail.com");
		driver.findElement(By.xpath("//input[@class='is_required validate account_input form-control' and @data-validate='isPasswd']")).sendKeys("12345");
	}

}
