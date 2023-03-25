Feature: US21 Register

#Open website "https://opencart.abstracta.us/"
 #Click on "My Account"
 #Click on "Register"
 #Enter "Loral" into  "First Name"
 #Enter "Jax" into  "Last Name"
 #Enter "campusc10003@techno.com" into  "E-Mail"
 #Enter "123456789" into  "Telephone"
 #Click on "Your Password               "
 #Enter "opncrt123" into  "Password"
 #Enter "opncrt123" into  "Password Confirm"
 #User should see the Privacy Policy checkbox option is not selected by default


  Scenario: Validate whether the 'Privacy Policy' checkbox option is not selected by default
    Given Navigate to My Account page
    When Select on Register button
    And Enter new Account fields
    Then User should see the Privacy Policy checkbox option is not selected by default
