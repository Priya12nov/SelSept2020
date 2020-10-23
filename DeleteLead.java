package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DeleteLead extends BasClass {
	public String text,leadID;
	
	@Given("click on Search Mobile number link")
	public void clickOnSearchMobileNumberLink() {
		driver.findElementByXPath("//span[text()='Phone']").click();
	}

	@Given("enter the Moblie Number(.*)")
	public void enterTheMoblieNumber(String pNo) {
		driver.findElementById("ext-gen270").sendKeys(pNo);

	}

	@Given("click the first result in List")
	public void clickTheFirstResultInList() {
		 leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();    
	}

	@Given("click on Delete Button")
	public void clickOnDeleteButton() {
		driver.findElementByLinkText("Delete").click();
		
	}

	@Given("search agin delete id")
	public void searchAginDeleteId() {
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		 text = driver.findElementByClassName("x-paging-info").getText();
		
	}

	@When("using if for deleted or not")
	public void usingIfForDeletedOrNot() {
	
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	
	
	}



}
