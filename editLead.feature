Feature: Edit Lead functionality in LeafTaps

Scenario Outline: edit Lead with only mandatory fields
Given click on crmsfa link
And click on lead link
And click on Find Lead link 
And Search for enter First Name <fName>
And click find lead Button
And click the first result in lead
And click on Edit Button
And Update on Company name <cName>
When click on Submit Button for editLead

Examples:
|fName|cName|
|Karthik|HCL|
#|Ram|TCS|
