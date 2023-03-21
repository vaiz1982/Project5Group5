Feature: (TS_001) Register Functionality


#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Enter new  Account Details into all the Fields (First Name, Last Name,E-Mail, Password, Password Confirm, Newsletter and  Privacy Policy Fields)
#  4. Enter invalid phone number into the Telephone Field - <Refer Test Data>
#  5. Click on 'Continue' button (ER-1)
  Scenario Outline: Validate invalid phone number
    Given Navigate to My Account page
    When Select on Register button
    And Enter new account Details without phone number
    And enter invalid "<phoneNumber>"
    And Click on the Continue button
    Then user should see the error message under the phoneBox
    Examples:
      | phoneNumber |
      | 111         |
      | abcd        |
#bug alarm