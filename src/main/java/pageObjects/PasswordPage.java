package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage {

    public PasswordPage (WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id ="ap_password")
    public WebElement passWd;

    @FindBy(id = "signInSubmit")
    public WebElement signInSubmit;

    public void enterPassWd(String password)
    {
        passWd.sendKeys(password);
    }

    public void clickSignInSubmit()
    {
        signInSubmit.click();
    }

}
