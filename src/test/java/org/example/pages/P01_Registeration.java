package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class P01_Registeration {
    // 1- constructor
    public P01_Registeration(){
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(className="ico-register")
    public WebElement RegisterationLink;

    @FindBy(id="gender-male")
    public WebElement male;

    @FindBy(id="FirstName")
    public WebElement firstName;

    @FindBy(id="LastName")
    public WebElement lastName;

    @FindBy(name="DateOfBirthDay")
    public WebElement dateOfBirthDay;

    @FindBy(name="DateOfBirthMonth")
    public WebElement dateOfBirthMonth;

    @FindBy(name="DateOfBirthYear")
    public WebElement dateOfBirthYear;

    @FindBy(id="Email")
    public WebElement Email;

    @FindBy(id="Company")
    public WebElement Company;

    @FindBy(id="Password")
    public WebElement Password;


    @FindAll({
            @FindBy(name="ConfirmPassword"),
            @FindBy(id="ConfirmPassword")
    })
    public WebElement confirmPassword;

    @FindBy(id="register-button")
    public WebElement registerButton;

    @FindBy(className="result")
    public WebElement result;

}
