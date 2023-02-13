package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;



import static org.example.stepDefs.Hooks.driver;

public class D02_Login {

    P02_Login link1 = new P02_Login();
    @Given("user go to login page")
    public void user_go_to_login_page() {
        link1.loginNav.click();
    }

    @When("user login with valid {string} and {string}")
    public void userValidLogin(String email, String password) {
        link1.email.sendKeys(email);
        link1.password.sendKeys(password);
    }

    @When("user login with invalid {string} and {string}")
    public void userInvalidLogin(String invEmail, String invPassword) {
        link1.email.sendKeys(invEmail);
        link1.password.sendKeys(invPassword);
    }

    @And("user press on login button")
    public void user_press_on_login_button() {
        link1.loginButton.click();
    }

    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
        SoftAssert assertion = new SoftAssert();
        assertion.assertTrue(driver.getCurrentUrl().equals("https://demo.nopcommerce.com/"));
        assertion.assertTrue(link1.myAccountTab.isDisplayed());
        assertion.assertAll();
    }

    @Then("user could not login to the system")
    public void user_could_not_login_to_the_system() {
        SoftAssert assertion = new SoftAssert();
        assertion.assertTrue(link1.loginErrorSummary.getText().contains("Login was unsuccessful."));
        assertion.assertEquals(Color.fromString(link1.loginErrorSummary.getCssValue("color")).asHex(),"#e4434b");
        assertion.assertAll();
    }
}
