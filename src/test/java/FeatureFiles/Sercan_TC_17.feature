Feature: (TS_001) Register Functionality


Scenario Outline: Validate whether the Password fields in the Register Account page are following Password Complexity Standards
Given Navigate to My Account page
When Select on Register button
And Enter the fields without password
And Check entering simple "<password>"And Click on the Continue button
Examples:
|password|
|123  |