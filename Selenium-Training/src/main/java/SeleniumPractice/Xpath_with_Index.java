package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_with_Index {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
        driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("kandukurismruthivm9@gmail.com");
		
		driver.findElement(By.id("SubmitCreate")).click();
		
		Thread.sleep(5000);
		
		//Index based selection
		
		driver.findElement(By.xpath("(//input[@name='id_gender'])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@name='id_gender'])[2]")).click();
		
	
	}

}
