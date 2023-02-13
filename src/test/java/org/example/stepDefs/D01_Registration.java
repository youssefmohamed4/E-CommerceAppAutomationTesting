package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Registeration;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;



public class D01_Registration {
    P01_Registeration link = new P01_Registeration();
    @Given("User navigate to registration page")
    public void user_navigate_to_registration_page() {
        link.RegisterationLink.click();
    }
    @When("User chooses a gender")
    public void userChoosesAGender() {
        link.male.click();
    }



    @And("User Enters {string} & {string}")
    public void userEntersName(String firstname,String lastname) {
        link.firstName.sendKeys(firstname);
        link.lastName.sendKeys(lastname);
    }


    @And("User Chooses date of birth")
    public void userChoosesDateOfBirth() {
        Select selectDay = new Select(link.dateOfBirthDay);
        selectDay.selectByValue("2");

        Select selectMonth = new Select(link.dateOfBirthMonth);
        selectMonth.selectByVisibleText("February");

        Select selectYear = new Select(link.dateOfBirthYear);
        selectYear.selectByValue("1998");
    }

    @And("User Enters Email")
    public void userEntersEmail() {
        //generate Random email
        Faker fake = new Faker();
        String email = fake.internet().safeEmailAddress();
        link.Email.sendKeys(email);
    }

    @And("User Enters Company Name")
    public void userEntersCompanyName() {
        link.Company.sendKeys("LOL");
    }


    @And("User Enters {string} Password")
    public void userEntersPassword(String Password) {
        link.Password.sendKeys(Password);
    }

    @And("User Confirms {string} Password")
    public void userConfirmsPassword(String Password) {
        link.confirmPassword.sendKeys(Password);
    }

    @And("User Click register button")
    public void userClickRegisterButton() {
        link.registerButton.click();
    }

    @Then("New Account is registered")
    public void newAccountIsRegistered() {
        SoftAssert assertion = new SoftAssert();
        assertion.assertTrue(link.result.getText().toLowerCase().contains("your registration completed"));
        assertion.assertTrue(link.result.getCssValue("color").equals("rgba(76, 177, 124, 1)"));
    }
}
