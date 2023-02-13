package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_Homepage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class D06_homeSlidersStepDefs {
    P03_Homepage link = new P03_Homepage();
    @When("User clicks on the first Slider")
    public void user_clicks_on_the_first_slider() {
        link.sliders.get(1).click();
    }
    @Then("User in navigated to the first product page")
    public void user_in_navigated_to_the_first_product_page() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(link.header));
        SoftAssert assertion = new SoftAssert();
        assertion.assertTrue(Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/nokia-lumia-1020"));
        assertion.assertAll();
    }

    @When("User clicks on the second Slider")
    public void user_clicks_on_the_second_slider() {
        link.sliders.get(0).click();
    }
    @Then("User in navigated to the second product page")
    public void user_in_navigated_to_the_second_product_page() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(link.header));
        SoftAssert assertion = new SoftAssert();
        assertion.assertTrue(Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/iphone-6"));
        assertion.assertAll();
    }
}
