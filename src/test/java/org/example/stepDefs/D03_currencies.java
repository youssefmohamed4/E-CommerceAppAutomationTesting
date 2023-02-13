package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_Homepage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currencies {
P03_Homepage link = new P03_Homepage();

@When("User selects the euro currency")
    public void selectCurrency(){
    Select currency = new Select(link.customerCurrency);
    currency.selectByVisibleText("Euro");
}

@Then("Products displayed in Euro")
    public void displayProducts(){
        for (int i = 0; i <link.price.size(); i++){
        String productPrice = link.price.get(i).getText();
        Assert.assertTrue(productPrice.contains("€"));
    }
}
    }
