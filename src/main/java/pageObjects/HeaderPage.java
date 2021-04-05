package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {

    public WebDriver driver;

    public HeaderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(id="nav-link-accountList-nav-line-1")
    public WebElement signInButton;

    @FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
    public WebElement helloMsg;

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchFld;

    @FindBy(id="nav-search-submit-button")
    public WebElement searchIcon;

    @FindBy(id="nav-hamburger-menu")
    public WebElement hamburgerMenu;

    public void clickSignInButton()
    {
        signInButton.click();
    }

    public void checkHelloMsg(String msg)
    {
        String message = helloMsg.getText();
        System.out.println(message);
        Assert.assertEquals(msg,message);
    }

    public void enterSearchTerm(String searchTerm)
    {
        searchFld.sendKeys(searchTerm);
    }

    public void clickSearchIcon()
    {
        searchIcon.click();
    }

    public void clickHamburgerMenu()
    {
        hamburgerMenu.click();
    }

    public void clickHamburgerMainMenu(String mainMenuFld)
    {
        driver.findElement(By.xpath("//div[@id='hmenu-content']//div[text()='"+mainMenuFld+"']")).click();
    }

    public void clickHamburgerSubMenu(String subMenuFld)
    {
        driver.findElement(By.xpath("//a[text()='"+subMenuFld+"']")).click();
    }
}
