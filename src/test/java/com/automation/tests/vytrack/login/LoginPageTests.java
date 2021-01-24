package com.automation.tests.vytrack.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.*;


public class LoginPageTests {
private WebDriver driver;
private String URL=" https://qa2.vytrack.com/user/login ";
private By usernameBy= By.id("pretendedInput");
private By passwordBy=By.id("pretendedInput2");

@Test


 public void invalidUsername(Object sendKeys){


}

    @BeforeMethod
public void setup(){
        WebDriverManager.chromedriver().version("79").setup();
        driver=new ChromeDriver();
        driver.get(URL);

        driver.manage().window().maximize();

    }
  @AfterMethod
    public void teardown(){
        if (driver !=null){
            driver.quit();
            driver= null;

        }
  }
}