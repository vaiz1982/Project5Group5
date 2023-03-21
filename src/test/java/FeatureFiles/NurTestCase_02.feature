Feature: (TS_001) Register Functionality
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Enter new Account Details into the Mandatory Fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm and  Privacy Policy Fields)
#  4. Click on 'Continue' button
#  5. Check the email address used for registering the account (Verify ER-1, ER-2. ER-3)
#  6. Click on the Login page link from the Email body (Verify ER-4)
  Background:
    Given Navigate to My Account page
    When Select on Register button
    And Enter new Account Fields without email
    And Click on the Continue button


  Scenario: Validate 'Thank you for registering' email is sent to the registered email address as a confirmation for registering the account
    And click the email address for registering the account
    And Click the login page link from Email body
    Then user should receive an email to email inbox
#bug alarm