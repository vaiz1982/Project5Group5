Feature:

  Scenario: TC 13 - Validate all the fields in the Register Account page have the proper placeholders
    Given Navigate to OpenCart Page
    When Click on My Account Button Drop menu
    And Click on Register option
    And View the First Name, Last Name, E-Mail, Telephone, Password, Password Confirm fields for Placeholders
    Then User should see Proper Placeholder texts  displayed in these fields
