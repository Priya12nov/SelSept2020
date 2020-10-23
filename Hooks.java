package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BasClass {
	
	
	@Before
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://leaftaps.com/opentaps/control/main" );
		  driver.findElementById("username").sendKeys("demosalesmanager");

		  driver.findElementById("password").sendKeys("crmsfa"); 
		  driver.findElementByClassName("decorativeSubmit").click();

		  
			

	}
	@After
	public void postCondition() {
driver.close();
	}
	

}
