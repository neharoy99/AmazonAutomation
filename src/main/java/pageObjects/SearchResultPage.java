package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {

    public SearchResultPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")
    public WebElement actualSearchResult;

    public void ValidateSearch(String expectedSearchResult)
    {
        String trimString = actualSearchResult.getText();
        trimString = trimString.substring(1,trimString.length()-1);
        Assert.assertEquals(expectedSearchResult,trimString);
    }
}
