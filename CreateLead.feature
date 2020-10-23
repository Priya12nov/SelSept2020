Feature: Create Lead functionality in LeafTaps

Scenario Outline: Create Lead with only mandatory fields
Given click on crmsfa link
And click on lead link
And click on Create Lead
And create a company Name as <cName>
And create a first Name as <fName>
And create a Last Name as <lName>
When click on Submit Button

Examples:
|cName|fName|lName|
|TCS|Karthi|M|
|Prasath|HCL|R|