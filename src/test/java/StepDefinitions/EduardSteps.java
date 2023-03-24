package StepDefinitions;

import Pages.EduardPOM;
import UtilityPacage.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class EduardSteps {
    EduardPOM ed = new EduardPOM();
    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));

    @Given("Open WebApplication")
    public void openWebApplication() {
        BasicDriver.getDriver().get("https://opencart.abstracta.us/");
    }

    @When("Click on My Account Drop menu")
    public void clickOnMyAccountDropMenu() {
        ed.clickMethod(ed.getMyAccount());
    }

    @And("Click on Register option")
    public void clickOnRegisterOption() {
        ed.clickMethod(ed.getRegUnderMyAccount());
    }

    @And("Enter new Account Details into all the Fields")
    public void enterNewAccountDetailsIntoAllTheFields() {

        ed.sendKeysMethod(ed.getFirstName(), "Sophia");
        ed.sendKeysMethod(ed.getLastName(), "Lutai");
        ed.sendKeysMethod(ed.geteMail(), "Sophia78@gmail.com");
        ed.sendKeysMethod(ed.getTel(), "6465587242");
        ed.sendKeysMethod(ed.getPassword(), "qwert123");
        ed.sendKeysMethod(ed.getConfirm(), "qwert123");
        ed.clickMethod(ed.getCheckBox());
// Background
    }

    @When("Click on Yes radio option for Newsletter")
    public void clickOnYesRadioOptionForNewsletter() {
        ed.clickMethod(ed.getYesRadBut());
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        ed.clickMethod(ed.getContinueButton());
    }

    @And("Click on Continue button that is displayed in the Account Success page")
    public void clickOnContinueButtonThatIsDisplayedInTheAccountSuccessPage() {
        ed.clickMethod(ed.getContinueAnderAccess());
    }

    @And("Click on Subscribe unsubscribe to newsletter option")
    public void clickOnSubscribeUnsubscribeToNewsletterOption() {
        ed.clickMethod(ed.getNewSleter());
    }

    @Then("I should be logged in,  taken to Account Succcess page and proper details should be displayed on the page")
    public void iShouldBeLoggedInTakenToAccountSucccessPageAndProperDetailsShouldBeDisplayedOnThePage() {
        String url = BasicDriver.getDriver().getCurrentUrl();
        Assert.assertEquals(url, "https://opencart.abstracta.us/index.php?route=account/newsletter", "test is failed");

    }

    @Then("User should be taken to Account page")
    public void userShouldBeTakenToAccountPage() {
        Assert.assertTrue(ed.getH1().isDisplayed(), "test is failed");
    }

    @Then("Yes option should be displayed as selected by default in the Newsletter page\"")
    public void yesOptionShouldBeDisplayedAsSelectedByDefaultInTheNewsletterPage() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
        Assert.assertTrue(ed.getYesRadBut().isSelected(), "test is failed");
        Assert.assertTrue(ed.getYesRadBut().isSelected(), "test is failed");
    }

    @When("Click on No  radio option for Newsletter")
    public void clickOnNoRadioOptionForNewsletter() {
        ed.clickMethod(ed.getRadioNoButton());
    }



    @Then("Account should not be created, instead a proper field level warning message or page level warning message to provide valid email address should be displayed")
    public void accountShouldNotBeCreatedInsteadAProperFieldLevelWarningMessageOrPageLevelWarningMessageToProvideValidEmailAddressShouldBeDisplayed() {
Assert.assertTrue(ed.getErrorMailMessage().isDisplayed(),"test is failed");
    }

    @Then("No option should be displayed as selected by default in the Newsletter page\"")
    public void noOptionShouldBeDisplayedAsSelectedByDefaultInTheNewsletterPage() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
       // Assert.assertTrue(ed.getRadioNoButton().isDisplayed(),"test is failed");
        Assert.assertTrue(ed.getRadioNoButton().isDisplayed(),"test is failed");
    }

    @When("Enter invalid email address into the E-Mail Field")
    public void enterInvalidEmailAddressIntoTheEMailField() {
        ed.geteMail().clear();
        ed.sendKeysMethod(ed.geteMail(), "pavanol@");


    }

    @Then("User should be logged in,  taken to Account Succcess page and proper details should be displayed on the page")
    public void userShouldBeLoggedInTakenToAccountSucccessPageAndProperDetailsShouldBeDisplayedOnThePage() {
        Assert.assertTrue(ed.getH1().isDisplayed(), "test is failed");
    }

    @When("Enter new Account Details into all the Fields second Time")
    public void enterNewAccountDetailsIntoAllTheFieldsSecondTime() {
        ed.sendKeysMethod(ed.getFirstName(), "Sophia");
        ed.sendKeysMethod(ed.getLastName(), "Lutai");
        ed.sendKeysMethod(ed.geteMail(), "Sophia5@gmail.com");
        ed.sendKeysMethod(ed.getTel(), "6465587242");
        ed.sendKeysMethod(ed.getPassword(), "qwert123");
        ed.sendKeysMethod(ed.getConfirm(), "qwert123");
        ed.clickMethod(ed.getCheckBox());
    }


    @When("Enter new Account Details withinvalid email address into the E-Mail")
    public void enterNewAccountDetailsWithinvalidEmailAddressIntoTheEMail() {
        ed.sendKeysMethod(ed.getFirstName(), "Sophia");
        ed.sendKeysMethod(ed.getLastName(), "Lutai");
        ed.sendKeysMethod(ed.geteMail(), "pavanol@gmail");
        ed.sendKeysMethod(ed.getTel(), "6465587242");
        ed.sendKeysMethod(ed.getPassword(), "qwert123");
        ed.sendKeysMethod(ed.getConfirm(), "qwert123");
        ed.clickMethod(ed.getCheckBox());
    }

    @And("Clean the forms")
    public void cleanTheForms() {
        ed.getFirstName().clear();
        ed.getLastName().clear();
        ed.geteMail().clear();
        ed.getTel().clear();
        ed.getPassword().clear();
        ed.getConfirm().clear();
    }

    @When("When Enter new Account Details withinvalid email address into the E-Mail sec")
    public void whenEnterNewAccountDetailsWithinvalidEmailAddressIntoTheEMailSec() {
        ed.sendKeysMethod(ed.getFirstName(), "Sophia");
        ed.sendKeysMethod(ed.getLastName(), "Lutai");
        ed.sendKeysMethod(ed.geteMail(), "pavanol@");
        ed.sendKeysMethod(ed.getTel(), "6465587242");
        ed.sendKeysMethod(ed.getPassword(), "qwert123");
        ed.sendKeysMethod(ed.getConfirm(), "qwert123");
        ed.clickMethod(ed.getCheckBox());
    }

    @When("When Enter new Account Details withinvalid email address into the E-Mail th")
    public void whenEnterNewAccountDetailsWithinvalidEmailAddressIntoTheEMailTh() {
        ed.sendKeysMethod(ed.getFirstName(), "Sophia");
        ed.sendKeysMethod(ed.getLastName(), "Lutai");
        ed.sendKeysMethod(ed.geteMail(), "pavanol");
        ed.sendKeysMethod(ed.getTel(), "6465587242");
        ed.sendKeysMethod(ed.getPassword(), "qwert123");
        ed.sendKeysMethod(ed.getConfirm(), "qwert123");
        ed.clickMethod(ed.getCheckBox());

    }

    @When("When Enter new Account Details withinvalid email address into the E-Mail fo")
    public void whenEnterNewAccountDetailsWithinvalidEmailAddressIntoTheEMailFo() {
        ed.sendKeysMethod(ed.getFirstName(), "Sophia");
        ed.sendKeysMethod(ed.getLastName(), "Lutai");
        ed.sendKeysMethod(ed.geteMail(), "pavanol@gmail.com");
        ed.sendKeysMethod(ed.getTel(), "6465587242");
        ed.sendKeysMethod(ed.getPassword(), "qwert123");
        ed.sendKeysMethod(ed.getConfirm(), "qwert123");
        ed.clickMethod(ed.getCheckBox());
    }


    /**"Try all below invalid email address formats:
     1) pavanol
     2) pavanol@
     3) pavanol@gmail
     4) pavanol@gmail.com
     "
     */
}
