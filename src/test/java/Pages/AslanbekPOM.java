package Pages;

import UtilityPacage.BasicDriver;
import UtilityPacage.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AslanbekPOM extends MyMethods {
    public AslanbekPOM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccount;

    @FindBy(xpath = "//span[text()='My Account']/../..//a[text()='Register']")
    private WebElement registerUnderMyAccount;

    @FindBy(xpath = "//span[text()='My Account']/../..//a[text()='Login']")
    private WebElement loginUnderMyAccount;

    @FindBy(xpath = "//div[@class='well']/h2[text()='New Customer']/..//a")
    private WebElement continueBtnInsideCustomerBox;

    @FindBy(xpath = "//aside[@id='column-right']//a[text()='Register']")
    private WebElement registerFromRightColumn;

    @FindBy(xpath = "//div[@id='content']/h1[text()='Account']")
    private WebElement registerAccountPageAssertionElement;

    @FindBy(xpath = "//div[@id='content']/h1[text()='Account']/..//input[@id='input-firstname']")
    private WebElement firstNameRegistration;

    @FindBy(xpath = "//div[@id='content']/h1[text()='Account']/..//input[@id='input-lastname']")
    private WebElement lastNameRegistration;

    @FindBy(xpath = "//div[@id='content']/h1[text()='Account']/..//input[@id='input-email']")
    private WebElement eMailRegistration;

    @FindBy(xpath = "//div[@id='content']/h1[text()='Account']/..//input[@id='input-telephone']")
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

    @FindBy(xpath = "//div[text()='Password confirmation does not match password!']")
    private WebElement errorMsgConfirmPasswordMisMatchRegistration;

    @FindBy(xpath = "//div[contains(text(),'Warning: E-Mail Address is already registered!')]")
    private WebElement errorMsgUserAlreadyExistRegistration;


    public WebElement getMyAccount() {
        return myAccount;
    }

    public WebElement getRegisterUnderMyAccount() {
        return registerUnderMyAccount;
    }

    public WebElement getLoginUnderMyAccount() {
        return loginUnderMyAccount;
    }

    public WebElement getContinueBtnInsideCustomerBox() {
        return continueBtnInsideCustomerBox;
    }

    public WebElement getRegisterFromRightColumn() {
        return registerFromRightColumn;
    }

    public WebElement getRegisterAccountPageAssertionElement() {
        return registerAccountPageAssertionElement;
    }

    public WebElement getFirstNameRegistration() {
        return firstNameRegistration;
    }

    public WebElement getLastNameRegistration() {
        return lastNameRegistration;
    }

    public WebElement geteMailRegistration() {
        return eMailRegistration;
    }

    public WebElement getTelephoneRegistration() {
        return telephoneRegistration;
    }

    public WebElement getPasswordRegistration() {
        return passwordRegistration;
    }

    public WebElement getConfirmPasswordRegistration() {
        return confirmPasswordRegistration;
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

    public WebElement getErrorMsgConfirmPasswordMisMatchRegistration() {
        return errorMsgConfirmPasswordMisMatchRegistration;
    }

    public WebElement getErrorMsgUserAlreadyExistRegistration() {
        return errorMsgUserAlreadyExistRegistration;
    }
}
