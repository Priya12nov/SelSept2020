package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CreateLead extends BasClass {
	
	@Given("click on crmsfa link")
	public void clickOnCrmsfaLink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("click on lead link")
	public void clickOnLeadLink() {
		driver.findElementByLinkText("Leads").click();
	    
	       
	}

	@Given("click on Create Lead")
	public void clickOnCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	    
	}

	@Given("create a company Name as (.*)")
	public void createACompanyName(String cN) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cN);
	      
	}

	@Given("create a first Name as (.*)")
	public void createAFirstName(String fN) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fN);
	    
	  
	}
	@Given("create a Last Name as (.*)")
	public void createALastName(String lN) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lN);
	    	  
	  
	}
	
	@When("click on Submit Button")
	public void clickOnSubmitButton() {
		driver.findElementByName("submitButton").click();    
	}



	

}
