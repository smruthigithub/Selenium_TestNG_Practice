package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDOM_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		WebElement search = driver.findElement(By.id("input"));
		
		search.sendKeys("Sprite");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String exe = "return document.getElementById(\"input\").value";
		
		String res = (String) js.executeScript(exe);

		System.out.println("Value is "+ res);
		
		System.out.println(exe);
	}

	}


