Feature:
  Scenario:Validate Registering an Account by providing all the fields
    Given Navigate to OpenCart webPage
    When I Click on My Account Drop menu
    And I Click on Register option
    And I Enter new Account Details into all the Fields First Name, Last Name, E-Mail,Telephone,Password,Confirm Password, Newsletter and  Privacy Policy Fields
    Then User should be logged in, taken to Account Success page and proper details should be displayed on the page

    Scenario:Validate proper notification messages are displayed after not filling out any mandatory fields
      Given Navigate to OpenCart webPage
      When I Click on My Account Drop menu
      And I Click on Register option
      And I do not fill out any mandatory fields
      And I Click on Continue button
      Then Warning messages should be displayed for the corresponding fields