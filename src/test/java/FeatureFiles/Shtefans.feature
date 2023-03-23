Feature: Registration



#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Check all the fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm,
#  Newsletter and  Privacy Policy Fields) including the 'Continue' button (ER-1)

  Background:
    Given Navigate to OpenCart webPage
    When I Click on 'My Account' Drop menu
    And I Click on Register option

  Scenario: TC 18 - Validate whether the fields in the Register Account page are according
  the Client requirements (Examples- Height, Width, Number of characters etc.)

    Then Text fields should abide to the Client requirements


#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Password,
#  Password Confirm, Newsletter and  Privacy Policy Fields) - by adding leading and trailing spaces to the applicable
#  fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm)
#  4. Click on 'Continue' button (ER-1)

  Scenario: TC 19 - Validate whether the leading and trailing spaces entered into the Register Account fields are trimmed


    And I Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Newsletter and  Privacy Policy Fields)
    And I Click on Continue button
    Then The leading and trailing spaces entered into these fields should automatically get trimmed on successful account creation






