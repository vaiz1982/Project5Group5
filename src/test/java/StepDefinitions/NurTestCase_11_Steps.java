package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class NurTestCase_11_Steps {
    NurPOMPage elements=new NurPOMPage();
    @And("Enter new account Details without phone number")
    public void enterNewAccountDetailsWithoutPhoneNumber() {
        elements.sendKeysMethod(elements.getFirstNameInput(), "nour");
        elements.sendKeysMethod(elements.getLastNameInput(), "akcay");
        elements.sendKeysMethod(elements.getEmailInput(), "campusc1201@techno.com");
        elements.sendKeysMethod(elements.getPasswordButton(), "Na123");
        elements.sendKeysMethod(elements.getConfirmPasswordButton(), "Na123");
        elements.clickMethod(elements.getCheckBox());
    }

    @And("enter invalid {string}")
    public void enterInvalid(String phoneNumber) {
        elements.sendKeysMethod(elements.getPhoneInput(), phoneNumber);
    }

    @Then("user should see the error message under the phoneBox")
    public void userShouldSeeTheErrorMessageUnderThePhoneBox() {
        Assert.assertTrue(elements.getPhoneNumErrorMessage().isDisplayed());
    }
}
