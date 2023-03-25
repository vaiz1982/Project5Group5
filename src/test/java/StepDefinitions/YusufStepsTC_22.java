package StepDefinitions;

import Pages.YusufPOM;
import UtilityPacage.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class YusufStepsTC_22 {
    YusufPOM ya = new YusufPOM();
    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));

    @And("I Enter any password into Password and Password Confirm fields")
    public void iEnterAnyPasswordIntoPasswordAndPasswordConfirmFields() {
        ya.sendKeysMethod(ya.getPasswordInput(), "qwerty");
        ya.sendKeysMethod(ya.getConfirmPasswordInput(), "qwerty");
    }
    @Then("I validate the Password and Password Confirm texts are toggled to hide visibility")
    public void iValidateThePasswordTextIsToggledToHideItsVisibility() {

        String passwordType = ya.getPasswordInput().getAttribute("type");
        String confirmPasswordType = ya.getConfirmPasswordInput().getAttribute("type");
        Assert.assertEquals(passwordType,"password");
        Assert.assertEquals(confirmPasswordType,"password");

    }


}
