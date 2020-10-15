package Week5.day1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDuplicateLead extends PreandPost {
	@DataProvider(name ="pN")
	public String[] getData(){
		String [] ph = new String[1];
		ph [0]= "99";
		return ph;
	}
		
	
	
	
@Test(dataProvider ="pN")

	public  void testDuplicateLead(String pN) throws InterruptedException {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(pN);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementByName("submitButton").click();
	}
}



