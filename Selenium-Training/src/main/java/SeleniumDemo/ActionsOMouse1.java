package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOMouse1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		Actions acts = new Actions(driver);
		
		WebElement step1 = driver.findElement(By.xpath("//a[@qa='categoryDD']"));
			
		acts.moveToElement(step1).build().perform();
		
		Thread.sleep(5000);
		
		WebElement step2 = driver.findElement(By.linkText("Bakery, Cakes & Dairy"));
		
		acts.moveToElement(step2).build().perform();
		
		Thread.sleep(3000);
		
		WebElement step3 = driver.findElement(By.linkText("Breads & Buns"));

		acts.moveToElement(step3).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Milk, White & Sandwich")).click();
	
	}

	}


