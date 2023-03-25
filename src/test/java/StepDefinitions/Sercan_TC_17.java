package StepDefinitions;
import Pages.NurPOMPage;
import UtilityPacage.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sercan_TC_17 {



    public class Steps17 {
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
        @And("Enter the fields without password")
        public void enterTheFieldsWithoutPassword() {
            elements.sendKeysMethod(elements.getFirstNameInput(), "sercan");
            elements.sendKeysMethod(elements.getLastNameInput(), "senlikci");
            elements.sendKeysMethod(elements.getEmailInput(), "senlikci@disco.com");
            elements.sendKeysMethod(elements.getPhoneInput(), "5555093837");
            elements.clickMethod(elements.getCheckBox());
        }

        @And("Check entering simple {string}")
        public void checkEnteringSimple(String password) {
            elements.sendKeysMethod(elements.getPasswordButton(),password);
            elements.sendKeysMethod(elements.getConfirmPasswordButton(), password);

        }

        @And("Click on the Continue button")
        public void clickOnTheContinueButton(){

            elements.clickMethod(elements.getContinueButton());

        }
    }
}
