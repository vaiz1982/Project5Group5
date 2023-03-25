package StepDefinitions;

import Pages.OpenCart_Melisa_TestNG;
import UtilityPacage.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Melisa_21_ {

    OpenCart_Melisa_TestNG elements = new OpenCart_Melisa_TestNG();


    @Given("Navigate to My Account page")
    public void navigateToMyAccountPage() {
        BasicDriver.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
        elements.clickMethod(elements.myAccountButton);
    }

    @When("Select on Register button")
    public void selectOnRegisterButton() {
        elements.clickMethod(elements.registerButton);
    }

    @And("Enter new Account fields")
    public void enterNewAccountFields() {
        elements.fillRegister();
    }

    @And("Click on the Continue button")
    public void clickOnTheContinueButton() {
        elements.clickMethod(elements.continueButton);
    }


    @Then("User should see the Privacy Policy checkbox option is not selected by default")
    public void userShouldSeePrivacyPolicyCheckboxOptionIsNotSelectedByDefault() {
        elements.privacyPolicyCheckBox.isDisplayed();
        Assert.assertTrue(!elements.privacyPolicyCheckBox.isSelected(), "'Privacy Policy' checkbox option is selected by default");

    }
}
