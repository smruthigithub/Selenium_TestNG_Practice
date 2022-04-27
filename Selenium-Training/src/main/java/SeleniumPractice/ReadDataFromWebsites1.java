package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromWebsites1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("santosh@test.com");
		
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
		WebElement getTextData = driver.findElement(By.xpath("//h1[contains(text(), 'My account')]"));
		
		String afterLoginText= getTextData.getText();
		
		System.out.println(afterLoginText);
		
		String accountinfo = driver.findElement(By.xpath("//p[@class='info-account']")).getText();
		
		System.out.println(accountinfo);
	}

}
