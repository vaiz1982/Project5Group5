Feature: Test Case Eduard

  Background: Go to URL
    Given Open WebApplication
    When  Click on My Account Drop menu
    And   Click on Register option





Scenario: TEST 05
When Enter new Account Details into all the Fields
When  Click on Yes radio option for Newsletter
And Click on Continue button
And Click on Continue button that is displayed in the Account Success page
And Click on Subscribe unsubscribe to newsletter option
Then I should be logged in,  taken to Account Succcess page and proper details should be displayed on the page
Then User should be taken to Account page
Then Yes option should be displayed as selected by default in the Newsletter page"

Scenario: TEST 06
When Enter new Account Details into all the Fields second Time
When Click on No  radio option for Newsletter
And Click on Continue button
And Click on Continue button that is displayed in the Account Success page
And Click on Subscribe unsubscribe to newsletter option
  Then  User should be logged in,  taken to Account Succcess page and proper details should be displayed on the page
Then User should be taken to Account page
Then No option should be displayed as selected by default in the Newsletter page"


Scenario:  TEST 10

  When Enter new Account Details withinvalid email address into the E-Mail

And    Click on Continue button

Then Account should not be created, instead a proper field level warning message or page level warning message to provide valid email address should be displayed
And Clean the forms
 When When Enter new Account Details withinvalid email address into the E-Mail sec
  And    Click on Continue button
  Then Account should not be created, instead a proper field level warning message or page level warning message to provide valid email address should be displayed

  And Clean the forms
  When When Enter new Account Details withinvalid email address into the E-Mail th
  And    Click on Continue button
  Then Account should not be created, instead a proper field level warning message or page level warning message to provide valid email address should be displayed

  And Clean the forms
  When When Enter new Account Details withinvalid email address into the E-Mail fo
  And    Click on Continue button
  Then Account should not be created, instead a proper field level warning message or page level warning message to provide valid email address should be displayed



