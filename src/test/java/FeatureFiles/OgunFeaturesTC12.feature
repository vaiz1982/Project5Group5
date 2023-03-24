Feature:

  Scenario: TC 12 - Validate Registering an Account by using the Keyboard keys
    Given Navigate to OpenCart Page
    When Click on My Account Button Drop menu
    And Click on Register option
    And Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Password,Password Confirm, Newsletter and  Privacy Policy Fields) by using Keyboard keys (Tab, Spacebar and Enter)
    And Click on Continue button
    Then User should register account successfully

