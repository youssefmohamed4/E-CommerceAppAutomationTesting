package org.example.stepDefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class D05_hoverCategories {
    P03_Homepage link = new P03_Homepage();
    Actions action = new Actions(Hooks.driver);
    public  int selectedCategory;
    @Given("User hovers over a random the category")
    public void user_hovers_over_a_random_the_category() throws InterruptedException {
        int count =  link.mainCategories.size();
        int min = 0;
        int max = count-1;
        selectedCategory =  (int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println(selectedCategory);
            action.moveToElement(link.mainCategories.get(selectedCategory)).perform();
            Thread.sleep(2000);
    }
    @When("User clicks on one of the sub categories")
    public void user_clicks_on_one_of_the_sub_categories() {
        link.mainCategories.get(selectedCategory).getText();
        link.mainCategories.get(selectedCategory).click();
    }
    @Then("User is navigated to the sub category page")
    public void user_is_navigated_to_the_sub_category_page() {
        Assert.assertEquals(link.mainCategories.get(selectedCategory).getText().toLowerCase().trim(), Hooks.driver.findElement(By.className("page-title")).getText().toLowerCase().trim());
    }







//    //2- Select random profile then hover on the card then click on "View profile" link
//    List<WebElement> avatars = Hooks.driver.findElements(By.cssSelector("img[src=\"/img/avatar-blank.jpg\"]"));
//    int count = avatars.size();
//    //3- How to select random element
//
//        /*
//        Example:   Generate random int value from 0 to 2
//
//        int min = 0;  int max = 2;
//        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
//        */
//
//
//    int min = 0;
//    int max = count-1;   // you are selecting random value from 0 to 2 that's why  max = count-1
//    int selectedUser =  (int)Math.floor(Math.random()*(max-min+1)+min);
//        System.out.println(selectedUser);
//        action.moveToElements(avatars.get(selectedUser)).perform();
//        Thread.sleep(2000);
//
//    List<WebElement> profileLinks = Hooks.driver.findElements(By.cssSelector("a[href*=\"/users/\"]"));
//        profileLinks.get(selectedUser).click();  // As we mentioned above, SelectedUser can't be 3

}
