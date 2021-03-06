package com.automation.tests.day6;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.automation.utilities.DriverFactory.createDriver;

public class NoSelectDropdown {

    public static void main(String[] args) throws Exception {

        WebDriver driver = createDriver("chrome");
     driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);
        driver.findElement(By.id("dropdownMenuLink")).click();
BrowserUtils.wait(2);
driver.findElement(By.linkText("Amazon")).click();
    BrowserUtils.wait(3);





    driver.quit();

    }

}