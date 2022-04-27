package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Pages.FooterLinksPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyaccountPage;
import excel.ExcelReader;

public class TestBase {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	public ExcelReader datatable;
	
	public FooterLinksPage footerLinksObj;
	public HomePage homePageObj;
	public LoginPage loginObj;
	public MyaccountPage myAccountObj;
	
	@BeforeClass(groups = {"P1", "P2", "P3"})
	public void beforeclass() throws IOException {
		
		datatable = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\spreadsheets\\TestData.xlsx");
		
		prop = new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
		prop.load(fis);
		
		if (prop.getProperty("browser").equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		} 
		
		if (prop.getProperty("browser").equals("edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\Edge\\msedgedriver.exe");
			
			driver = new EdgeDriver();
			
		}
		
		if (prop.getProperty("browser").equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Selenium-Training\\drivers\\chrome\\Firefox\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		}else
		{
			System.out.println("Provided browser is not supported");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		footerLinksObj = new FooterLinksPage(driver);
		homePageObj = new HomePage(driver);
		loginObj = new LoginPage(driver);
		myAccountObj = new MyaccountPage(driver);
	}
	
	
	@BeforeMethod(groups = {"P1", "P2", "P3"})
	public void beforemethod() {
		driver.get(prop.getProperty("url"));
	}
	
	@AfterClass(groups = {"P1", "P2", "P3"})
	public void afterclass() {
		driver.quit();
	}

}
