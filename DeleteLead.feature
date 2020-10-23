Feature: Delete Lead functionality in LeafTaps

Scenario Outline: delete Lead with only mandatory fields
Given click on crmsfa link
And click on lead link
And click on Find Lead link 
And click on Search Mobile number link
And enter the Moblie Number <99>
And click find lead Button
And click the first result in List
And click on Delete Button
And search agin delete id 
When using if for deleted or not 

Examples:
|pNo|
|99|



