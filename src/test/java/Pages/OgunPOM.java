package Pages;

import UtilityPacage.BasicDriver;
import UtilityPacage.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OgunPOM extends MyMethods {
    public OgunPOM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//a[text()='Register']")
    private WebElement registerButton;

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@name='telephone']")
    private WebElement telephoneInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@name='confirm']")
    private WebElement confirmPasswordInput;

    @FindBy(linkText = "NewsLetter")
    private WebElement newsLetterHeader;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    private WebElement newsLetterYesButton;

    @FindBy(xpath = "(//input[@type='radio'])[3]")
    private WebElement newsLetterNoButton;

    @FindBy(xpath = "//input[@name='agree']")
    private WebElement agreeButton;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//p[text()='Congratulations! Your new account has been successfully created!']")
    private WebElement successAccountConfirmation;


    public WebElement getMyAccountButton() {return myAccountButton;}
    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getTelephoneInput() {
        return telephoneInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getConfirmPasswordInput() {
        return confirmPasswordInput;
    }

    public WebElement getNewsLetterHeader() {
        return newsLetterHeader;
    }

    public WebElement getNewsLetterYesButton() {
        return newsLetterYesButton;
    }

    public WebElement getNewsLetterNoButton() {
        return newsLetterNoButton;
    }

    public WebElement getAgreeButton() {
        return agreeButton;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getSuccessAccountConfirmation() {return successAccountConfirmation;}
}
