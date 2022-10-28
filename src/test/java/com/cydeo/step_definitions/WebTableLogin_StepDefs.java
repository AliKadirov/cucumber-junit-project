package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WebTableLogin_StepDefs {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the login page of web table app")
    public void userIsOnTheLoginPageOfWebTableApp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }

    @When("user enters username {string}")
    public void userEntersUsername(String arg0) {
        webTableLoginPage.inputUserName.sendKeys(arg0);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String arg0) {
        webTableLoginPage.inputPassword.sendKeys(arg0);
    }

    @And("user clicks to login button")
    public void userClicksToLoginButton() {
        webTableLoginPage.loginButton.click();
    }

    @Then("user should see url contains orders")
    public void userShouldSeeUrlContainsOrders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
        
    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
        webTableLoginPage.inputUserName.sendKeys(username);
        webTableLoginPage.inputPassword.sendKeys(password);
        webTableLoginPage.loginButton.click();
    }
}
