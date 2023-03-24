Feature:

  Scenario:
    Given Navigate to OpenCart webPage
    When I Click on My Account Drop menu
    And I Click on Register option
    And I Enter any password into Password and Password Confirm fields
    Then I validate the Password and Password Confirm texts are toggled to hide visibility

