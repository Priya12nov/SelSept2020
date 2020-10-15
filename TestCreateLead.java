package Week5.day1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCreateLead extends PreandPost{
@DataProvider(name ="cl")	
public String[][] getDatae() {
String [][] data = new String[3][3];
//Row1
data[0][0] = "Wipro";
data[0][1] = "Ram";
data[0][2] = "A";
//Row2
data[1][0] = "HCL";
data[1][1] = "karthi";
data[1][2] = "M";
//Row3
data[2][0] = "Tcs";
data[2][1] = "Prasath";
data[2][2] = "R";

return data;


}
	

@Test(dataProvider ="cl")
	public  void testCreateLead(String cN, String fN , String lN ) throws InterruptedException {
		driver.findElementByLinkText("Leads").click();
        driver.findElementByLinkText("Create Lead").click();
        driver.findElementById("createLeadForm_companyName").sendKeys(cN);
        driver.findElementById("createLeadForm_firstName").sendKeys(fN);
        driver.findElementById("createLeadForm_lastName").sendKeys(lN);
        driver.findElementByName("submitButton").click();
        
	}
}


