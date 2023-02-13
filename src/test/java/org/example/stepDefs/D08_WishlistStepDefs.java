package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_Homepage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDefs {
    P03_Homepage link = new P03_Homepage();

    @When("user clicks on wishlist button")
    public void user_clicks_on_wishlist_button() {
    link.addToWishlistButton.click();}

    @Then("product is added to wishlist")
    public void product_is_added_to_wishlist() {
        SoftAssert assertion = new SoftAssert();
        assertion.assertTrue(link.addToWishlistSuccess.isDisplayed());
        assertion.assertTrue(Color.fromString(link.addToWishlistSuccess.getCssValue("background-color")).asHex().equals("#4bb07a"));
    }

    @Then("product is added to wishlist and Qty updated")
    public void product_is_added_to_wishlist_and_qty_updated() {
        WebDriverWait wait =new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(link.addToWishlistSuccess));
        String qty = link.wishlistQty.getText();
        Assert.assertTrue(Integer.valueOf(qty) > 0);
    }

}
