package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login extends BasClass  {
	
/*	@Given("open the chrome browser as maximized")
	public void openTheChromeBrowserAsMaximized() {
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		  driver.manage().window().maximize();
	}

	@Given("load the application url")
	public void loadTheApplicationUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main" );
		
	}
*/
	/*@Given("enter the username as (.*)")
	public void enterTheUsernameAsDemosalesmanager(String UName) {
		driver.findElementById("username").sendKeys(UName);
	}

	@Given("enter the password as (.*)")
	public void enterThePasswordAsCrmsfa(String passWord) {
		driver.findElementById("password").sendKeys(passWord); 
	}

	@When("click on login button")
	public void clickOnLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

*/	@Then("homepage should be displayed")
	public void homepageShouldBeDisplayed() {
		
		
		System.out.println("Home Page is Display");
		  
	}
	@But("homepage should not displayed")
public void notDisplayedHp() {
System.out.println("Home Page not Displyed");
}

}
