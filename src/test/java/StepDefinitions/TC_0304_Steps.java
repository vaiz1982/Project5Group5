package StepDefinitions;

import Pages.TC_0304_POM;
import UtilityPacage.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TC_0304_Steps extends BasicDriver {

    TC_0304_POM hp = new TC_0304_POM();
    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(5));


    @And("I Enter new Account Details into all the Fields First Name, Last Name, E-Mail,Telephone,Password,Confirm Password, Newsletter and  Privacy Policy Fields")
    public void iEnterNewAccountDetailsIntoAllTheFieldsFirstNameLastNameEMailTelephonePasswordConfirmPasswordNewsletterAndPrivacyPolicyFields() {
        hp.sendKeysMethod(hp.getFirstNameRegistration(), "Hasan");
        hp.sendKeysMethod(hp.getLastNameRegistration(), "Sahin");
        hp.sendKeysMethod(hp.geteMailRegistration(), "qatest@testing.com");
        hp.sendKeysMethod(hp.getPasswordRegistration(), "qaqaqa112233");
        hp.sendKeysMethod(hp.getTelephoneRegistration(), "13123345642");
        hp.sendKeysMethod(hp.getConfirmPasswordRegistration(), "qaqaqa112233");
        hp.clickMethod(hp.getNewsLetterYesRegistration());
        hp.clickMethod(hp.getPrivacyPolicyCheckBoxRegistration());
        hp.clickMethod(hp.getContinueBtnRegistration());
    }


    @Then("User should be logged in, taken to Account Success page and proper details should be displayed on the page")
    public void userShouldBeLoggedInTakenToAccountSuccessPageAndProperDetailsShouldBeDisplayedOnThePage() {
        wait.until(ExpectedConditions.visibilityOf(hp.getSuccessMessage()));
        String actualPageTitle = getDriver().getTitle();

        Assert.assertEquals(actualPageTitle, "Your Account Has Been Created!");
        Assert.assertTrue(hp.getSuccessMessage().isDisplayed(), "Test has failed");
    }

    @And("I do not fill out any mandatory fields")
    public void iDoNotFillOutAnyMandatoryFields() {
    }

    @Then("Warning messages should be displayed for the corresponding fields")
    public void warningMessagesShouldBeDisplayedForTheRespectiveFields() {
        wait.until(ExpectedConditions.visibilityOf(hp.getFirstNameWarningMessage()));
        Assert.assertTrue(hp.getFirstNameWarningMessage().isDisplayed());
        Assert.assertTrue(hp.getLastNameWarningMessage().isDisplayed());
        Assert.assertTrue(hp.getEmailWarningMessage().isDisplayed());
        Assert.assertTrue(hp.getTelephoneWarningMessage().isDisplayed());
        Assert.assertTrue(hp.getPasswordWarningMessage().isDisplayed());
    }
}
