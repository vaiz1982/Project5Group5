Feature: US20-Register

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
 #Click on "Continue"
 #See   "Warning: You must agree to the Privacy Policy! "

  Scenario: Validate Registering the Account without selecting the 'Privacy Policy' checkbox option (20)

    Given Navigate to My Account page
    When Select on Register button
    And Enter new Account fields
    And Click on the Continue button
    Then User should see the alert " Warning: You must agree to the Privacy Policy! "

