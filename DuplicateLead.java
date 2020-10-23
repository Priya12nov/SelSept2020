package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DuplicateLead extends BasClass {
	
	
	@Given("click Duplicate lead button")
	public void clickDuplicateLeadButton() {
		driver.findElementByLinkText("Duplicate Lead").click();
	    
	}

	@When("click submit button")
	public void clickSubmitButton() {
		driver.findElementByName("submitButton").click();
	    
	}



}
