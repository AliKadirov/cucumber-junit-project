package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia {

    WikiSearchPage search = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        search.searchBox.sendKeys("Steve Jobs");
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        search.searchButton.click();
    }

    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
//        String actualTitle = "Steve Jobs - Wikipedia";
//        String expectedTitle = Driver.getDriver().getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle);

//        BrowserUtils.verifyTitle(Driver.getDriver(),"Steve Jobs - Wikipedia");
        Assert.assertTrue("Title verification is failed!", Driver.getDriver().getTitle().contains("Steve Jobs"));

    }

    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String searchKeyword) {
        search.searchBox.sendKeys(searchKeyword);
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String searchKeyword) {
        Assert.assertTrue("Title verification is failed!", Driver.getDriver().getTitle().contains(searchKeyword));
    }
}
