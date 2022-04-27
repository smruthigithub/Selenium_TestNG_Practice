package TestNG_Bigbasket_Excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;

public class TestCases2 extends TestBase{
	
	@Test(groups = {"P3"})
	public void testcase001() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));
		
	//Doubleclick on the webelement
		act.moveToElement(search).click().sendKeys("TOMATO").doubleClick().build().perform();
		Thread.sleep(5000);
	
	}
	
	@Test(groups = {"P1"})
	public void testcase002() {
		String vegName = "tomato";
		
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));
		
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(vegName).build().perform();
			
	}
	
	@Test(groups = {"P2"})
	public void testcase003() throws InterruptedException {
		Actions act = new Actions(driver);
		
		WebElement shopeBycat= driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
		act.moveToElement(shopeBycat).build().perform();                
		Thread.sleep(3000);
	if(shopeBycat.isDisplayed() && shopeBycat.isEnabled()) {
		driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")).click();
		}else {
			
			System.out.println("Web element is not present");
		}	
		
	}

}
