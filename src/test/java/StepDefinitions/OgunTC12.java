package StepDefinitions;

import Pages.OgunPOM;
import UtilityPacage.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class OgunTC12 {
    OgunPOM elements = new OgunPOM();

    @Given("Navigate to OpenCart Page")
    public void navigateToOpenCartPage() {
        BasicDriver.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
    }

    @When("Click on My Account Button Drop menu")
    public void clickOnMyAccountButtonDropMenu() {
        elements.clickMethod(elements.getMyAccountButton());
    }

    @And("Click on Register option")
    public void clickOnRegisterOption() {
        elements.clickMethod(elements.getRegisterButton());
    }

    @And("Enter new Account Details into all the Fields \\(First Name, Last Name, E-Mail,Telephone, Password,Password Confirm, Newsletter and  Privacy Policy Fields) by using Keyboard keys \\(Tab, Spacebar and Enter)")
    public void enterNewAccountDetailsIntoAllTheFieldsFirstNameLastNameEMailTelephonePasswordPasswordConfirmNewsletterAndPrivacyPolicyFieldsByUsingKeyboardKeysTabSpacebarAndEnter() {
        elements.sendKeysMethod(elements.getFirstNameInput(), "John"+Keys.TAB+"Snow"+Keys.TAB+"johnsnow2@outlook.com"+Keys.TAB+"111-222-3344"+Keys.TAB+"1234567890"+Keys.TAB+"1234567890"+Keys.TAB+Keys.TAB+Keys.TAB+Keys.SPACE+Keys.ENTER);


    }
    @Then("Click on Continue button")
    public void clickOnContinueButton() {
    }

    @Then("User should register account successfully")
    public void userShouldRegisterAccountSuccessfully() {
        Assert.assertTrue(elements.getSuccessAccountConfirmation().isDisplayed());

    }
}


