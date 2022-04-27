package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		String searchText = "Shirts";
		
		String searchText1 = "Jeans";
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='search_query_top']//following-sibling::button"));
		
		searchBox.sendKeys(searchText);
		
		searchButton.click();
		
		driver.close();
		
	}

}
