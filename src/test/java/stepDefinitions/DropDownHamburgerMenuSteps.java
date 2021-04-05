package stepDefinitions;

import com.sun.corba.se.impl.encoding.CDRInputObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.HeaderPage;

public class DropDownHamburgerMenuSteps extends CommonFunctions {

    HeaderPage headerPage = new HeaderPage(driver);

    @When("^I click on the drop down Hamburger menu$")
    public void i_click_on_the_drop_down_Hamburger_menu() {
        headerPage.clickHamburgerMenu();
        implicitWait(3);
    }


    @When("^I click on the appropriate menu option \"([^\"]*)\"$")
    public void i_click_on_the_appropriate_menu_option(String menu) {
        headerPage.clickHamburgerMainMenu(menu);
    }

    @When("^I click on the appropriate sub menu option \"([^\"]*)\"$")
    public void i_click_on_the_appropriate_sub_menu_option(String submenu)  {
        headerPage.clickHamburgerSubMenu(submenu);
    }

    @Then("^I am directed to appropriate product page \"([^\"]*)\"$")
    public void i_am_directed_to_appropriate_product_page(String resultTitle) {

    }
}
