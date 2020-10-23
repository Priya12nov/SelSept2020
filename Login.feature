Feature: Login functionality for LeafTaps application

Scenario: Test login with positive creadentials
Given open the chrome browser as maximized
And load the application url
And enter the username as demosalesmanager
And enter the password as crmsfa
When click on login button
Then homepage should be displayed


