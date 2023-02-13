package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_Homepage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDefs {
    P03_Homepage link = new P03_Homepage();
    @When("User clicks the facebook logo")
    public void user_clicks_the_facebook_logo() {
        link.facebookLink.click();
    }

    @Then("User is directed to the {string} facebook page")
    public void user_is_directed_to_the_facebook_page(String facebookLink) {
        WebDriverWait wait =new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        //switch driver to tab1
        Hooks.driver.switchTo().window(tabs.get(1));
        //get URL and assert it's facebook.com
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertTrue(Hooks.driver.getCurrentUrl().equals(facebookLink));
    }

    @When("User clicks the twitter logo")
    public void user_clicks_the_twitter_logo() {
        link.twitterLink.click();
    }

    @Then("User is directed to the {string} twitter page")
    public void user_is_directed_to_the_twitter_page(String twitterLink) {
        WebDriverWait wait =new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        //switch driver to tab1
        Hooks.driver.switchTo().window(tabs.get(1));
        //get URL and assert it's facebook.com
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertTrue(Hooks.driver.getCurrentUrl().equals(twitterLink));
    }

    @When("User clicks the rss logo")
    public void user_clicks_the_rss_logo() {
        link.rssLink.click();
    }

    @Then("User is directed to the {string} rss page")
    public void user_is_directed_to_the_rss_page(String rssLink) {
        WebDriverWait wait =new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        //switch driver to tab1
        Hooks.driver.switchTo().window(tabs.get(1));
        //get URL and assert it's facebook.com
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertTrue(Hooks.driver.getCurrentUrl().equals(rssLink));
    }

    @When("User clicks the youtube logo")
    public void user_clicks_the_youtube_logo() {
        link.youtubeLink.click();
    }

    @Then("User is directed to the {string} youtube page")
    public void user_is_directed_to_the_youtube_page(String youtubeLink) {
        WebDriverWait wait =new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        //switch driver to tab1
        Hooks.driver.switchTo().window(tabs.get(1));
        //get URL and assert it's facebook.com
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertTrue(Hooks.driver.getCurrentUrl().equals(youtubeLink));
    }
}
