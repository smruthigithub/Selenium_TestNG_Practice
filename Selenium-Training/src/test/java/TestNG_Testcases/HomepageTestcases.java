package TestNG_Testcases;

import static org.testng.Assert.assertEquals;

import org.apache.poi.util.SystemOutLogger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;

public class HomepageTestcases extends TestBase {
	
	@Test
	public void HomePage001() {
		
		homePageObj.getMyBasket().click();
		
		Assert.assertEquals(homePageObj.getMybasketText().getText(), "Your basket is empty. Start shopping now!");
		
		System.out.println("Homepage001 is PASS");
	
		
		
		
	}

}
