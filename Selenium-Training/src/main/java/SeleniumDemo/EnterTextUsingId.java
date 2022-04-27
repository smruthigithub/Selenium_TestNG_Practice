package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTextUsingId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		//driver.findElement(By.id("search_query_top")).sendKeys("T-shirts"); //By using ID
		
		//driver.findElement(By.name("search_query")).sendKeys("Sarees"); //By using name
		
		driver.findElement(By.className("search_query form-control ac_input")).sendKeys("Sarees");

	}

}
