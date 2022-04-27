package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromWebsites {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("kandukurismruthivm@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']/parent::div/following-sibling::div/input")).sendKeys("Grace@3030");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement getTextData = driver.findElement(By.xpath("//div[contains(text(), 'My Naukri')]"));
		
		String afterLoginText= getTextData.getText();
		
		System.out.println(afterLoginText);
	}

}
