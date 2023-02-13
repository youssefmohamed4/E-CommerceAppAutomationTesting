package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class P03_Homepage {
    public P03_Homepage() {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(id="customerCurrency")
    public WebElement customerCurrency;

    @FindAll({
            @FindBy(className="price actual-price")
    })
    public List<WebElement> price;

    @FindBy(id="small-searchterms")
    public WebElement searchBar;

    @FindBy(className="button-1 search-box-button")
    public WebElement searchButton;

    @FindAll({
        @FindBy(className="sublist-toggle")
            })
    public List<WebElement> mainCategories;

    @FindAll({
            @FindBy(className="nivo-imageLink")
    })
    public List<WebElement> sliders;

    @FindBy(className="header-logo")
    public WebElement header;

    @FindBy(className="facebook")
    public WebElement facebookLink;

    @FindBy(className="twitter")
    public WebElement twitterLink;

    @FindBy(className="rss")
    public WebElement rssLink;

    @FindBy(className="youtube")
    public WebElement youtubeLink;

    @FindBy(className="button-2 add-to-wishlist-button")
    public WebElement addToWishlistButton;

    @FindBy(className="content")
    public WebElement addToWishlistSuccess;

    @FindBy(className="wishlist-qty")
    public WebElement wishlistQty;
}
