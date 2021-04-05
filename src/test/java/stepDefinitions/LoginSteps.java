package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.HeaderPage;
import pageObjects.LoginPage;
import pageObjects.PasswordPage;

public class LoginSteps extends CommonFunctions {


    HeaderPage headerPage = new HeaderPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    PasswordPage passwordPage = new PasswordPage(driver);


    @Given("^I am on home page \"([^\"]*)\"$")
    public void i_am_on_home_page(String url) throws Exception{
        driver.get(readFile("url"));
    }

    @When("^I click on Sign in button$")
    public void i_click_on_Sign_in_button() {
        headerPage.clickSignInButton();
    }

    @When("^I enter a valid email address \"([^\"]*)\"$")
    public void i_enter_a_valid_email_address(String emailId){
        implicitWait(3);
        loginPage.enterEmailAdd(emailId);
    }

    @When("^I click on continue button$")
    public void i_click_on_continue_button() {
        loginPage.clickContinue();
    }

    @When("^I enter a valid password \"([^\"]*)\"$")
    public void i_enter_a_valid_password(String passWd){
        implicitWait(3);
        passwordPage.enterPassWd(passWd);
    }


    @When("^I click on Sign In submit$")
    public void i_click_on_Sign_In_submit() {
        passwordPage.clickSignInSubmit();
    }

    @Then("^I should be on Amazon homepage with a message \"([^\"]*)\"$")
    public void i_should_be_on_Amazon_homepage_with_a_message(String message) {
        implicitWait(3);
        headerPage.checkHelloMsg(message);
    }

}
