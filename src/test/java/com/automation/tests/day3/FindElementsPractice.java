package com.automation.tests.day3;

import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsPractice {
    public static void main(String[] args) throws Exception {

        //WebDriverManager.chromedriver().setup();
        //   WebDriver driver =  new ChromeDriver();

        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName = driver.findElement(By.name("full_name"));


        fullName.sendKeys(" Mister Twister");
        Thread.sleep(2000);
        WebElement email = (WebElement) driver.findElements(By.name("email"));
        email.sendKeys("sdet@cybertek.com");
        Thread.sleep(2000);
        email.sendKeys("binalhan@gmail.com");
        WebElement signUp = By.name(("wooden_spoon")).findElement(driver);

        signUp.submit();
        Thread.sleep(2000);
        String expected = ("Thank you for signing up.Click the button to return to the home page");

        WebElement message = driver.findElement(By.className("subheader"));
        String actual = message.getText();

        if (expected.equals(actual)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test faild");

        }


        driver.quit();
    }

}
