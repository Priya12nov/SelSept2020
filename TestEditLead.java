package Week5.day1;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestEditLead extends PreandPost {
	@DataProvider(name ="edit")
	public String[] [] getData(){
		String [] []ed = new String[1] [2];
		ed [0][0]= "sam";
		ed[0][1]= "Tcs";
		return ed;
		
	}
	
@Test(dataProvider="edit")
	public  void testEditLead(String Fn, String Cn) throws InterruptedException {
	driver.findElementByXPath("//a[text( )='Leads']").click();
		driver.findElementByXPath("//a[text( )='Find Leads']").click();
		  driver.findElementById("ext-gen248").sendKeys(Fn);
		  driver.findElementById("ext-gen334").click();
		  Thread.sleep(2000);
		  
		  driver.findElementByXPath("//table[@class='x-grid3-row-table']//a").click();
		  driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
		  driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
		  driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys(Cn);
		  driver.findElementByXPath("//input[@name='submitButton']").click();
		  
		  

	}

}
