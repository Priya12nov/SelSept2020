Feature: Duplicate Lead functionality in LeafTaps

Scenario Outline: Duplicate Lead with only mandatory fields
Given click on crmsfa link
And click on lead link
And click on Find Lead link 
And click on Search Mobile number link
And enter the Moblie Number<pNo>
And click find lead Button
And click the first result in List
And click Duplicate lead button
When click submit button

Examples:
|pNo|
|99|
