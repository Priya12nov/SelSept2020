package Week5.day1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestDeleteLead extends PreandPost {
	@DataProvider(name ="pN")
	public String[] getData(){
		String [] ph = new String[1];
		ph [0]= "99";
		return ph;
		
		
	}
	

	@Test(dataProvider ="pN")

	public void testDeleteLead(String pN) throws InterruptedException {
	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementById("ext-gen270").sendKeys(pN);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//table[@class='x-grid3-row-table']//a").click();
			driver.findElementByXPath("(//a[@class='subMenuButton']/following-sibling::a)[3]").click();
			

	}

}
