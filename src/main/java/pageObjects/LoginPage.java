package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ap_email")
    public WebElement emailAdd;

    @FindBy(id = "continue")
    public WebElement continueButton;

    public void enterEmailAdd(String emailId)
    {

        emailAdd.sendKeys(emailId);
    }

    public void clickContinue()
    {
        continueButton.click();
    }
}
