package SeleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PickBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String Browser = "Firefox";
		
		WebDriver driver = null;
		
		if(Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
			
			driver = new ChromeDriver();	
		}
		
		else if (Browser.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\Firefox\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		}
		
		else if  (Browser.equals("edge")){
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\Edge\\msedgedriver.exe");
			
			driver = new EdgeDriver();
		}
		else {System.out.println("Provided browser not exist");}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
	}

	}


