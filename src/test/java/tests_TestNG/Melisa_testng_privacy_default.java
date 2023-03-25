package tests_TestNG;

import Pages.OpenCart_Melisa_TestNG;

import UtilityPacage.BasicDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Melisa_testng_privacy_default {

    //21- Validate whether the 'Privacy Policy' checkbox option is not selected by default

    OpenCart_Melisa_TestNG openCart = new OpenCart_Melisa_TestNG();

    @Test
    public void PPCheckboxDefault() {

        openCart.fillRegister();
        openCart.privacyPolicyCheckBox.isDisplayed();
        Assert.assertTrue(!openCart.privacyPolicyCheckBox.isSelected(), "'Privacy Policy' checkbox option is selected by default");

        BasicDriver.quitDriver();
    }
}
