package StepDefinitions;

import Pages.NurPOMPage;
import UtilityPacage.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class NurTestCase_01_Steps {
    NurPOMPage elements = new NurPOMPage();


    @Given("Navigate to My Account page")
    public void navigateToMyAccountPage() {
        BasicDriver.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
        elements.clickMethod(elements.getMyAccountButton());
    }

    @When("Select on Register button")
    public void selectOnRegisterButton() {
        elements.clickMethod(elements.getRegisterButton());
    }

    @And("Enter new Account Fields")
    public void enterNewAccountFields() {
        elements.sendKeysMethod(elements.getFirstNameInput(), "nour");
        elements.sendKeysMethod(elements.getLastNameInput(), "akcay");
        elements.sendKeysMethod(elements.getEmailInput(), "campusc10003@techno.com");
        elements.sendKeysMethod(elements.getPhoneInput(), "1002003000");
        elements.sendKeysMethod(elements.getPasswordButton(), "Na123");
        elements.sendKeysMethod(elements.getConfirmPasswordButton(), "Na123");
        elements.clickMethod(elements.getCheckBox());

    }

    @And("Click on the Continue button")
    public void clickOnTheContinueButton(){
        elements.clickMethod(elements.getContinueButton());
    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        Assert.assertTrue(elements.getSuccessMessage().getText().contains("Congratulations!"));

    }


}
