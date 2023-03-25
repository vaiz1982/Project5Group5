package StepDefinitions;
import Pages.NurPOMPage;
import UtilityPacage.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sercan_TC_16  {





    public class Steps16 {
        NurPOMPage elements=new NurPOMPage();


        @Given("Navigate to My Account page")
        public void navigateToMyAccountPage() {
            BasicDriver.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
            elements.clickMethod(elements.getMyAccountButton());
        }
        @When("Select on Register Button")
        public void selectOnRegisterButton() {
            elements.clickMethod(elements.getRegisterButton());
        }
        @And("Enter new Account Fields with some spaces")
        public void enterNewAccountFieldsWithSomeSpaces() {
            elements.sendKeysMethod(elements.getFirstNameInput(), "ser   can");
            elements.sendKeysMethod(elements.getLastNameInput(), "sen   likci");
            elements.sendKeysMethod(elements.getEmailInput(), "senlik ci@disco.com");
            elements.sendKeysMethod(elements.getPhoneInput(), "555509    3738");
            elements.sendKeysMethod(elements.getPasswordButton(), "blah  dum1");
            elements.sendKeysMethod(elements.getConfirmPasswordButton(), "blah  dum1");
            elements.clickMethod(elements.getCheckBox());
        }

        @Then("user should see the error message under the all fields")
        public void userShouldSeeTheErrorMessageUnderTheAllFields() {

        }
    }
}
