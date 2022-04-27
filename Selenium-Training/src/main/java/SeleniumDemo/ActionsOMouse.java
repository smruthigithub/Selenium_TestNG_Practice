package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOMouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		Actions act = new Actions(driver);
		
		WebElement shopByCat = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
		
		act.moveToElement(shopByCat).build().perform();
		
		driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
	
		
		
	}

	}


