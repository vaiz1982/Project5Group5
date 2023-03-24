package StepDefinitions;

import Pages.ShtefanPOM;
import UtilityPacage.BasicDriver;
import UtilityPacage.MyMethods;
import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShtefanSteps extends MyMethods {

    ShtefanPOM shtP = new ShtefanPOM();

    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));

    // TC_18:
    @Given("Navigate to OpenCart webPage")
    public void navigateToOpenCartWebPage() {
        BasicDriver.getDriver().get("https://demo.opencart.com/index.php?route=common/home&language=en-gb");
        wait(2);
    }


    @When("I Click on 'My Account' Drop menu")
    public void iClickOnMyAccountDropMenu() {
        shtP.clickMethod(shtP.getMyAccount());
    }

    @And("I Click on Register option")
    public void iClickOnRegisterOption() {
        shtP.clickMethod(shtP.getRegisterUnderMyAcc());
    }

    @Then("Text fields should abide to the Client requirements")
    public void textFieldsShouldAbideToTheClientRequirements() {
        wait(2);
        System.out.println("RESULTS OF THE TEXT FIELDS:");
        System.out.println("First Name Box. Actual size: " + shtP.getFirstNameBox().getSize() + " Required Size: (801, 42)");
        System.out.println("Last Name Box. Actual size: " + shtP.getLastNameBox().getSize() + " Required Size: (801, 42)");
        System.out.println("Email Box. Actual size: " + shtP.getEmailBox().getSize() + " Required Size: (801, 42)");
        System.out.println("Password Box. Actual size: " + shtP.getPasswordBox().getSize() + " Required Size: (801, 42)");
        System.out.println("Radio button 'No' size:  " + shtP.getSubscribeNoRadioButton().getSize() + " Required: (12, 12)");
        System.out.println("Radio button 'Yes' size:  " + shtP.getSubscribeYesRadioButton().getSize() + " Required: (12, 12)");

    }

    //TC_19:

    @And("I Enter new Account Details into all the Fields \\(First Name, Last Name, E-Mail,Telephone, Newsletter and  Privacy Policy Fields)")
    public void iEnterNewAccountDetailsIntoAllTheFieldsFirstNameLastNameEMailTelephoneNewsletterAndPrivacyPolicyFields() {
        shtP.sendKeysMethod(shtP.getFirstNameBox(), "Shtefan");
        shtP.sendKeysMethod(shtP.getLastNameBox(), "Nuzhdenko");
        shtP.sendKeysMethod(shtP.getEmailBox(), "shtefannuzdenko@amazon.com");
        shtP.sendKeysMethod(shtP.getPasswordBox(), "qwerty123");
        shtP.clickMethod(shtP.getSubscribeYesRadioButton());
        shtP.clickMethod(shtP.getPrivacyCheckBox());


    }

    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
        wait(1);
        shtP.clickMethod(shtP.getSubmitButton());
    }

    @Then("The leading and trailing spaces entered into these fields should automatically get trimmed on successful account creation")
    public void theLeadingAndTrailingSpacesEnteredIntoTheseFieldsShouldAutomaticallyGetTrimmedOnSuccessfulAccountCreation() {
        wait(2);
        System.out.println("Verification:");
        if (shtP.getFirstNameBox().getText().isEmpty()) {
            System.out.println("First name: PASSED");
        }
        if (shtP.getLastNameBox().getText().isEmpty()) {
            System.out.println("Last name: PASSED");
        }
        if (shtP.getEmailBox().getText().isEmpty()) {
            System.out.println("Mail box: PASSED");
        }
        if (shtP.getPasswordBox().getText().isEmpty()) {
            System.out.println("Password box: PASSED");
        }
        if (!shtP.getPrivacyCheckBox().isEnabled()) {
            System.out.println("Privacy box: PASSED");
        }
        if (!shtP.getSubscribeYesRadioButton().isEnabled()) {
            System.out.println("Subscribe button: PASSED");
        }

    }
}
