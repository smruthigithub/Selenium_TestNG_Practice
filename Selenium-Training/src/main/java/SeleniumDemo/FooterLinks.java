package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		List<WebElement> FooterLink = driver.findElements(By.xpath("(//div[@class='wrap'])[1]//ul/li"));
		
		System.out.println(FooterLink.size());
		
		for(int i=0; i<FooterLink.size(); i++) {
			
			String footerLink = FooterLink.get(i).getText();
			
			System.out.println("List is "+footerLink);
		}

	}

}
