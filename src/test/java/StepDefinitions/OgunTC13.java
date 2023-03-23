package StepDefinitions;

import Pages.OgunPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class OgunTC13 {

    OgunPOM elements = new OgunPOM();

    @And("View the First Name, Last Name, E-Mail, Telephone, Password, Password Confirm fields for Placeholders")
    public void viewTheFirstNameLastNameEMailTelephonePasswordPasswordConfirmFieldsForPlaceholders() {
        System.out.println(elements.getFirstNameInput().getDomProperty("placeholder"));
        System.out.println(elements.getLastNameInput().getDomProperty("placeholder"));
        System.out.println(elements.getEmailInput().getDomProperty("placeholder"));
        System.out.println(elements.getTelephoneInput().getDomProperty("placeholder"));
        System.out.println(elements.getPasswordInput().getDomProperty("placeholder"));
        System.out.println(elements.getConfirmPasswordInput().getDomProperty("placeholder"));


    }

    @Then("User should see Proper Placeholder texts  displayed in these fields")
    public void userShouldSeeProperPlaceholderTextsDisplayedInTheseFields() {
        Assert.assertEquals(elements.getFirstNameInput().getDomProperty("placeholder"),"First Name");
        Assert.assertEquals(elements.getLastNameInput().getDomProperty("placeholder"),"Last Name");
        Assert.assertEquals(elements.getEmailInput().getDomProperty("placeholder"),"E-Mail");
        Assert.assertEquals(elements.getTelephoneInput().getDomProperty("placeholder"),"Telephone");
        Assert.assertEquals(elements.getPasswordInput().getDomProperty("placeholder"),"Password");
        Assert.assertEquals(elements.getConfirmPasswordInput().getDomProperty("placeholder"),"Password Confirm");
    }
}
