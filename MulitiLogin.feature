Feature: Login functionality for LeafTaps application
Background:
Given open the chrome browser as maximized
And load the application url

Scenario Outline: Test login with positive creadentials

Given enter the username as <UserName>
And enter the password as <Password>
When click on login button
Then homepage should be displayed

Examples:
|UserName|Password|
|demosalesmanager|crmsfa|


Scenario Outline: Test login with negative creadentials
Given enter the username as <UserName>
And enter the password as <Password>
When click on login button
But homepage should not displayed

Examples:
|UserName|Password|
|demo999|crmsfa|