package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageObjects.HeaderPage;
import pageObjects.SearchResultPage;

public class SearchSteps extends CommonFunctions {

    HeaderPage headerPage = new HeaderPage(driver);
    SearchResultPage searchResultPage = new SearchResultPage(driver);

    @Given("^I enter a search term \"([^\"]*)\"$")
    public void i_enter_a_search_term(String searchTerm) throws Exception{
        headerPage.enterSearchTerm(readFile("searchTerm"));
    }

    @Given("^I click on search Icon$")
    public void i_click_on_search_Icon(){
        headerPage.clickSearchIcon();
    }

    @Then("^I should get appropriate results with result heading \"([^\"]*)\"$")
    public void i_should_get_appropriate_results_with_result_heading(String expectedSearchResult) throws Exception{
        searchResultPage.ValidateSearch(readFile("expectedSearchResult"));
    }

    @When("^I add to bag with colour not being mandatory$")
    public void addProductToBag()
    {
        WebElement colourSlct = driver.findElement(By.id(""));
        if(colourSlct.isDisplayed())
        {
            new Select(colourSlct).selectByVisibleText("");
            driver.findElement(By.xpath("")).click();
        }
        else
        {
            driver.findElement(By.id("")).click();
        }
    }

}
