package StepDefinitions;

import Pages.NurPOMPage;
import UtilityPacage.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class NurTestCase_02_Steps {
    NurPOMPage elements=new NurPOMPage();
    @And("click the email address for registering the account")
    public void clickTheEmailAddressForRegisteringTheAccount() {
        Actions actions = new Actions(BasicDriver.getDriver());
        actions.sendKeys(Keys.CONTROL + "t").build().perform();
        ((JavascriptExecutor) BasicDriver.getDriver()).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(BasicDriver.getDriver().getWindowHandles());
        BasicDriver.getDriver().switchTo().window(tabs.get(1));

        BasicDriver.getDriver().get("https://generator.email/");
        WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(BasicDriver.getDriver().findElement(By.cssSelector("span[id=email_ch_text]"))));
        String emailAddress = BasicDriver.getDriver().findElement(By.cssSelector("span[id=email_ch_text]")).getText();
        System.out.println(emailAddress);
        BasicDriver.getDriver().switchTo().window(tabs.get(0));
        elements.sendKeysMethod(elements.getRegisterButton(), emailAddress);
        elements.clickMethod(elements.getContinueButton());
        elements.wait(3);
        BasicDriver.getDriver().switchTo().window(tabs.get(1));
        elements.wait(20);
        Assert.assertTrue(BasicDriver.getDriver().findElement(By.xpath("//div[@class='e7m col-md-9']//span[text()='" + emailAddress + "']")).isDisplayed());

    }

    @And("Click the login page link from Email body")
    public void clickTheLoginPageLinkFromEmailBody() {

    }

    @Then("user should receive an email to email inbox")
    public void userShouldReceiveAnEmailToEmailInbox() {
        //can not give confirmation email
    }

    @And("Enter new Account Fields without email")
    public void enterNewAccountFieldsWithoutEmail() {
        elements.sendKeysMethod(elements.getFirstNameInput(), "nour");
        elements.sendKeysMethod(elements.getLastNameInput(), "akcay");
        elements.sendKeysMethod(elements.getPhoneInput(), "10020033000");
        elements.sendKeysMethod(elements.getPasswordButton(), "Na123");
        elements.sendKeysMethod(elements.getConfirmPasswordButton(), "Na123");
        elements.clickMethod(elements.getCheckBox());

    }
}
