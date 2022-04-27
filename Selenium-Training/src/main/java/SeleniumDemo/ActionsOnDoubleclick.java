package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnDoubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		Actions act = new Actions(driver);
		
		WebElement search = driver.findElement(By.id("input"));
		
		act.moveToElement(search).click().sendKeys("PIZZA").doubleClick().build().perform();
		
		Thread.sleep(3000);
		
		act.moveToElement(search).contextClick().build().perform();
		
		
	
	}

	}


