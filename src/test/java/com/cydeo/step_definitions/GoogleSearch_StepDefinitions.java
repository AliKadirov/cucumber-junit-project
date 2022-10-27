package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class GoogleSearch_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.com/");

    }

    @When("user types apple in the google search box and click enter")
    public void user_types_apple_in_the_google_search_box_and_click_enter() {

        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

    }

    @Then("user sees apple - Google Search is in the google title")
    public void user_sees_apple_google_search_is_in_the_google_title() {

        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }


    @When("user types {string} in the google search box and click enter")
    public void userTypesInTheGoogleSearchBoxAndClickEnter(String searchKeyword) {

        googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);

    }

    @Then("user sees {string} is in the google title")
    public void userSeesIsInTheGoogleTitle(String expectedTitle) {

        
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);


    }
}
