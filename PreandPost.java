package Week5.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PreandPost {
public  ChromeDriver driver;

	
@Parameters({"username","password","url"})
@BeforeMethod
public void startApp(String uName,String pwd, String url) {
	WebDriverManager.chromedriver().setup();

	 driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get(url);
	driver.findElementById("username").sendKeys(uName);
	driver.findElementById("password").sendKeys(pwd);
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	}
@AfterMethod
public void closeApp() {
	driver.close();
	
}
}
