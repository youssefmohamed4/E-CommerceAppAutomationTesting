package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
 public static WebDriver driver = new ChromeDriver();
    @Before
    public static void openBrowser() {
        System.out.println("User Open browser");
        String key ="webdriver.chrome.driver";
        String value =System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe";
        System.setProperty(key,value);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
    }

    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
