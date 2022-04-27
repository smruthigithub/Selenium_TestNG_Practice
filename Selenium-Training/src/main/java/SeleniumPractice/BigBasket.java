package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.linkText("Login/Sign Up")).click();
		driver.findElement(By.xpath("//label[@for='otpEmail']")).click();
		driver.findElement(By.xpath("//input[@id='otpEmail']")).sendKeys("8247378070");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@id='input']")).sendKeys("Mosambi");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("Mosambi - Organically Grown")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'ADD TO BASKET')]")).click();
		driver.findElement(By.xpath("//div[@data-qa='add']")).click();
		
	}

}
