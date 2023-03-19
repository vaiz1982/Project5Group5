package StepDefinitions;


import Pages.AslanbekPOM;
import UtilityPacage.BasicDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AslanbekTCs7_8_9{
    AslanbekPOM ap = new AslanbekPOM();

    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));
    @Given("Navigate to OpenCart webPage")
    public void navigate_to_open_cart_web_page() {
        BasicDriver.getDriver().get("https://opencart.abstracta.us/");
    }
    @When("I Click on My Account Drop menu")
    public void i_click_on_my_account_drop_menu() {
        ap.clickMethod(ap.getMyAccount());
    }
    @When("I Click on Register option")
    public void i_click_on_register_option() {
        ap.clickMethod(ap.getRegisterUnderMyAccount());
    }
    @When("I Click on Login option")
    public void i_click_on_login_option() {
        ap.clickMethod(ap.getLoginUnderMyAccount());
    }
    @When("I Click on Continue button inside New Customer box")
    public void i_click_on_continue_button_inside_new_customer_box() {
        ap.clickMethod(ap.getContinueBtnInsideCustomerBox());
    }
    @When("I Repeat Steps 3 and 4")
    public void i_repeat_steps_and() {
        i_click_on_my_account_drop_menu();
        i_click_on_login_option();
    }
    @When("I Click on Register option from the Right Column options")
    public void i_click_on_register_option_from_the_right_column_options() {
        ap.clickMethod(ap.getRegisterFromRightColumn());
    }
    @Then("I should be taken to Register Account page")
    public void i_should_be_taken_to_register_account_page() {
        wait.until(ExpectedConditions.visibilityOf(ap.getRegisterAccountPageAssertionElement()));
        String title = BasicDriver.getDriver().getTitle();
        Assert.assertTrue(title.equals("Register Account"));
    }


    @And("I Enter new Account Details into all the Fields \\(First Name, Last Name, E-Mail,Telephone, Newsletter and  Privacy Policy Fields)")
    public void iEnterNewAccountDetailsIntoAllTheFieldsFirstNameLastNameEMailTelephoneNewsletterAndPrivacyPolicyFields() {
        ap.sendKeysMethod(ap.getFirstNameRegistration(),"Aslanbek");
        ap.sendKeysMethod(ap.getLastNameRegistration(),"Turganbayev");
        ap.sendKeysMethod(ap.geteMailRegistration(),"tester123@test.com");
        ap.sendKeysMethod(ap.getFirstNameRegistration(),"123456789");
        ap.clickMethod(ap.getNewsLetterYesRegistration());
        ap.clickMethod(ap.getPrivacyPolicyCheckBoxRegistration());
    }

    @And("I Enter any password say 12345 into the Password field")
    public void iEnterAnyPasswordSayIntoThePasswordField() {
        ap.sendKeysMethod(ap.getPasswordRegistration(),"12345");
    }

    @And("I Enter any different password say abcde into the Password Confirm field")
    public void iEnterAnyDifferentPasswordSayAbcdeIntoThePasswordConfirmField() {
        ap.sendKeysMethod(ap.getConfirmPasswordRegistration(),"abcde");
    }

    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
        ap.clickMethod(ap.getContinueBtnRegistration());
    }

    @Then("Account should not be created, instead a warning message - Password confirmation does not match password! should be displayed under Password Confirm field")
    public void accountShouldNotBeCreatedInsteadAWarningMessagePasswordConfirmationDoesNotMatchPasswordShouldBeDisplayedUnderPasswordConfirmField() {
        wait.until(ExpectedConditions.visibilityOf(ap.getErrorMsgConfirmPasswordMisMatchRegistration()));
        String actualText = ap.getTextMethod(ap.getErrorMsgConfirmPasswordMisMatchRegistration());
        String expectedText = "Password confirmation does not match password!";
        Assert.assertEquals(actualText,expectedText,"Error message on mismatch of password and confirm password failed");
    }

    @And("I Enter existing Account Details into all the Fields")
    public void iEnterExistingAccountDetailsIntoAllTheFields() {
        ap.sendKeysMethod(ap.getFirstNameRegistration(),"Pavan");
        ap.sendKeysMethod(ap.getLastNameRegistration(),"B");
        ap.sendKeysMethod(ap.geteMailRegistration(),"pavanoltraining@gmail.com");
        ap.sendKeysMethod(ap.getFirstNameRegistration(),"814240XXXX");
        ap.clickMethod(ap.getNewsLetterYesRegistration());
        ap.clickMethod(ap.getPrivacyPolicyCheckBoxRegistration());
        ap.sendKeysMethod(ap.getPasswordRegistration(),"12345");
        ap.sendKeysMethod(ap.getConfirmPasswordRegistration(),"12345");
    }

    @Then("Account should not be created again, instead the warning message - Warning: E-Mail Address is already registered! should be displayed")
    public void accountShouldNotBeCreatedAgainInsteadTheWarningMessageWarningEMailAddressIsAlreadyRegisteredShouldBeDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(ap.getErrorMsgUserAlreadyExistRegistration()));
        String actualText = ap.getTextMethod(ap.getErrorMsgUserAlreadyExistRegistration());
        String expectedText = "Warning: E-Mail Address is already registered!";
        Assert.assertTrue(actualText.contains(expectedText),"Error message on user is already created failed");
    }
}