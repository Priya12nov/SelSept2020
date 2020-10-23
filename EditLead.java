package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class EditLead extends BasClass {
	
	
	@Given("click on Find Lead link")
	public void clickOnFindLeadLink() throws InterruptedException {
		driver.findElementByXPath("//a[text( )='Find Leads']").click();
		Thread.sleep(2000);
	   	}

	@Given("Search for enter First Name (.*)")
	public void searchForEnterFirstName(String fName) {
		driver.findElementById("ext-gen248").sendKeys(fName);	}

	@Given("click find lead Button")
	public void clickFindLeadButton() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();		
		Thread.sleep(2000);
		
	  	}

	@Given("click the first result in lead")
	public void clickTheFirstResultInLead() {
		  driver.findElementByXPath("//table[@class='x-grid3-row-table']//a").click();

	}

	@Given("click on Edit Button")
	public void clickOnEditButton() {
		  driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();

	}

	@Given("Update on Company name(.*)")
	public void updateOnCompanyName(String cName) {
		driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
		  driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys(cName);
	}

	@When("click on Submit Button for editLead")
	public void clickOnSubmitButton() {
		 driver.findElementByXPath("//input[@name='submitButton']").click();

	}
}
