package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {

    public WebDriver driver;

    public ProductListPage (WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


    public void validateProductLink(String resultTitle){
        Assert.assertTrue(driver.getPageSource().contains(resultTitle));
    }
}
