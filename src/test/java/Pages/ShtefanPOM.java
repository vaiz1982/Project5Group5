package Pages;

import UtilityPacage.BasicDriver;
import UtilityPacage.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShtefanPOM extends MyMethods {
    public ShtefanPOM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='My Account']")
    private WebElement myAccount;
    @FindBy(xpath = "//span[text()='My Account']/../..//a[text()='Register']")
    private WebElement registerUnderMyAcc;
    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement firstNameBox;
    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement lastNameBox;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailBox;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement passwordBox;
    @FindBy(xpath = "//input[@id='input-newsletter-yes']")
    private WebElement subscribeYesRadioButton;
    @FindBy(xpath = "//input[@id='input-newsletter-no']")
    private WebElement subscribeNoRadioButton;
    @FindBy(xpath = "//input[@name='agree']")
    private WebElement privacyCheckBox;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getPrivacyCheckBox() {
        return privacyCheckBox;
    }

    public WebElement getMyAccount() {
        return myAccount;
    }

    public WebElement getRegisterUnderMyAcc() {
        return registerUnderMyAcc;
    }

    public WebElement getFirstNameBox() {
        return firstNameBox;
    }

    public WebElement getLastNameBox() {
        return lastNameBox;
    }

    public WebElement getEmailBox() {
        return emailBox;
    }

    public WebElement getPasswordBox() {
        return passwordBox;
    }

    public WebElement getSubscribeYesRadioButton() {
        return subscribeYesRadioButton;
    }

    public WebElement getSubscribeNoRadioButton() {
        return subscribeNoRadioButton;
    }
}
