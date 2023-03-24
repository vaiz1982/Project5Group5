package Pages;

import UtilityPacage.BasicDriver;
import UtilityPacage.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EduardPOM extends MyMethods {
    public EduardPOM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);

    }

    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccount;

    @FindBy(xpath = "//span[text()='My Account']/../..//a[text()='Register']")
    private WebElement regUnderMyAccount;

    @FindBy(id ="input-firstname")
    private WebElement firstName;

    @FindBy(id ="input-lastname")
    private WebElement lastName;

    @FindBy(id="input-email")
    private WebElement eMail;

    @FindBy(id = "input-telephone")
    private WebElement tel;

    @FindBy(xpath = "//*[@id=\"input-password\"]")
    private WebElement password;

    @FindBy(id ="input-confirm")
    private WebElement confirm;

    @FindBy(xpath ="//input[@name='newsletter']")
    private WebElement yesRadBut;

    @FindBy(xpath ="//*[@id=\"content\"]/form/div/div/input[1]")
    private WebElement checkBox;

    @FindBy (xpath = "//input[@type='submit']")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/a")
    private WebElement continueAnderAccess;

    @FindBy(xpath = "//*[@id=\"content\"]/ul[4]/li/a")
    private WebElement newSleter;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    private WebElement h1;

    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input")
    private WebElement radioNoButton;

    @FindBy(xpath = "//*[@id=\"account\"]/div[4]/div/div")
    private WebElement errorMailMessage;

    public WebElement getErrorMailMessage() {
        return errorMailMessage;
    }

    public WebElement getRadioNoButton() {
        return radioNoButton;
    }

    public WebElement getH1() {
        return h1;
    }

    public WebElement getNewSleter() {
        return newSleter;
    }

    public WebElement getContinueAnderAccess() {
        return continueAnderAccess;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement geteMail() {
        return eMail;
    }

    public WebElement getTel() {
        return tel;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getConfirm() {
        return confirm;
    }

    public WebElement getYesRadBut() {
        return yesRadBut;
    }

    public WebElement getCheckBox() {
        return checkBox;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getRegUnderMyAccount() {
        return regUnderMyAccount;
    }

    public WebElement getMyAccount() {
        return myAccount;
    }

}