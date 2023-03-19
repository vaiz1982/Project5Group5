Feature:

  Scenario: TC 7 - Validate different ways of navigating to 'Register Account' page
    Given Navigate to OpenCart webPage
    When I Click on My Account Drop menu
    And I Click on Register option
    And I Click on My Account Drop menu
    And I Click on Login option
    And I Click on Continue button inside New Customer box
    And I Repeat Steps 3 and 4
    And I Click on Register option from the Right Column options
    Then I should be taken to Register Account page

  Scenario: TC 8 - Validate Registering an Account by entering different passwords into 'Password' and 'Password Confirm' fields
    Given Navigate to OpenCart webPage
    When I Click on My Account Drop menu
    And I Click on Register option
    And I Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Newsletter and  Privacy Policy Fields)
    And I Enter any password say 12345 into the Password field
    And I Enter any different password say abcde into the Password Confirm field
    And I Click on Continue button
    Then Account should not be created, instead a warning message - Password confirmation does not match password! should be displayed under Password Confirm field



  Scenario: TC 9 - Validate Registering an Account by providing the existing account details (i.e. existing email address)
    Given Navigate to OpenCart webPage
    When I Click on My Account Drop menu
    And I Click on Register option
    And I Enter existing Account Details into all the Fields
    And I Click on Continue button
    Then Account should not be created again, instead the warning message - Warning: E-Mail Address is already registered! should be displayed








