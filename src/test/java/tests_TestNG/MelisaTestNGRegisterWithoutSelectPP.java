package tests_TestNG;

import Pages.OpenCart_Melisa_TestNG;
import UtilityPacage.BasicDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MelisaTestNGRegisterWithoutSelectPP {

    //Validate Registering the Account without selecting the 'Privacy Policy' checkbox option

    OpenCart_Melisa_TestNG openCart = new OpenCart_Melisa_TestNG();

    @Test
    public void registerWithoutSelectingPPCheckBox() {

        openCart.fillRegister();
        openCart.privacyPolicyCheckBox.isDisplayed();
        Assert.assertTrue(!openCart.privacyPolicyCheckBox.isSelected(), "'Privacy Policy' checkbox option is not selected by default");
        openCart.continueButton.click();

        Assert.assertTrue(openCart.allertMessagePrivacyPolicy.isDisplayed());

        BasicDriver.quitDriver();
    }
}
