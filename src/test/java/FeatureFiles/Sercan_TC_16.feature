Feature: (TS_001) Register Functionality


Scenario: Validate whether the Mandatory fields in the Register Account page are accepting only spaces
Given Navigate to My Account page
When Select on Register button
And Enter new Account Fields with some spaces
And Click on the Continue button
Then user should see the error message under the all fields