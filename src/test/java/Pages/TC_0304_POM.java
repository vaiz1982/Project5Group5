package Pages;

import UtilityPacage.BasicDriver;
import UtilityPacage.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_0304_POM extends MyMethods {
    public TC_0304_POM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@id='content']/h1[text()='Account']/..//input[@id='input-firstname']")
    private WebElement firstNameRegistration;
    @FindBy(xpath = "//div[@id='content']/h1[text()='Account']/..//input[@id='input-lastname']")
    private WebElement lastNameRegistration;
    @FindBy(xpath = "//div[@id='content']/h1[text()='Account']/..//input[@id='input-email']")
    private WebElement eMailRegistration;
    @FindBy(xpath = "//input[@id='input-telephone']")
    private WebElement telephoneRegistration;
    @FindBy(xpath = "//div[@id='content']/h1[text()='Account']/..//input[@id='input-password']")
    private WebElement passwordRegistration;
    @FindBy(xpath = "//div[@id='content']/h1[text()='Account']/..//input[@id='input-confirm']")
    private WebElement confirmPasswordRegistration;
    @FindBy(xpath = "//div[@id='content']/h1[text()='Account']/..//label[@class='radio-inline']/input[@value='1']")
    private WebElement newsLetterYesRegistration;
    @FindBy(xpath = "//div[@id='content']/h1[text()='Account']/..//input[@type='checkbox']")
    private WebElement privacyPolicyCheckBoxRegistration;
    @FindBy(xpath = "//div[@id='content']/h1[text()='Account']/..//input[@type='submit']")
    private WebElement continueBtnRegistration;
    @FindBy(xpath = "//div[@class='col-sm-9']/p[1]")
    private WebElement successMessage;
    @FindBy(xpath = "(//div[@class='text-danger'])[1]")
    private WebElement firstNameWarningMessage;
    @FindBy(xpath = "(//div[@class='text-danger'])[2]")
    private WebElement lastNameWarningMessage;
    @FindBy(xpath = "(//div[@class='text-danger'])[3]")
    private WebElement emailWarningMessage;
    @FindBy(xpath = "(//div[@class='text-danger'])[4]")
    private WebElement telephoneWarningMessage;
    @FindBy(xpath = "(//div[@class='text-danger'])[5]")
    private WebElement passwordWarningMessage;


    public WebElement getFirstNameRegistration() {
        return firstNameRegistration;
    }

    public WebElement getLastNameRegistration() {
        return lastNameRegistration;
    }

    public WebElement geteMailRegistration() {
        return eMailRegistration;
    }

    public WebElement getPasswordRegistration() {
        return passwordRegistration;
    }

    public WebElement getNewsLetterYesRegistration() {
        return newsLetterYesRegistration;
    }

    public WebElement getPrivacyPolicyCheckBoxRegistration() {
        return privacyPolicyCheckBoxRegistration;
    }

    public WebElement getContinueBtnRegistration() {
        return continueBtnRegistration;
    }

    public WebElement getTelephoneRegistration() {
        return telephoneRegistration;
    }

    public WebElement getConfirmPasswordRegistration() {
        return confirmPasswordRegistration;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getFirstNameWarningMessage() {
        return firstNameWarningMessage;
    }

    public WebElement getLastNameWarningMessage() {
        return lastNameWarningMessage;
    }

    public WebElement getEmailWarningMessage() {
        return emailWarningMessage;
    }

    public WebElement getTelephoneWarningMessage() {
        return telephoneWarningMessage;
    }

    public WebElement getPasswordWarningMessage() {
        return passwordWarningMessage;
    }
}
