package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_Homepage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_Search {
    P03_Homepage link = new P03_Homepage();
    @Given("user types a product name {string} in search bar")
    public void userSearchByName(String productName) {
        link.searchBar.sendKeys(productName);
    }
    @Given("user types a sku {string} in search bar")
    public void userSearchBySKU(String SKU) {
        link.searchBar.sendKeys(SKU);
    }
    @When("user clicks search button")
    public void user_clicks_search_button() {
      link.searchButton.click();
    }
    @Then("search shows relevant product name {string} results")
    public void nameResults(String productName) {
        SoftAssert assertion = new SoftAssert();
        assertion.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        int count = Hooks.driver.findElements(By.className("product-title")).size();
        for (int i = 0; i < count; i++) {
            assertion.assertTrue(Hooks.driver.findElements(By.className("product-title")).get(i).getText().toLowerCase().contains(productName));
            assertion.assertAll();
        }
    }

    @Then("search shows relevant sku {string} results")
    public void skuResults(String sku) {
        Hooks.driver.findElement(By.className("product-title")).click();
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("span[class=\"value\"]")).getText().contains(sku));
    }
}
