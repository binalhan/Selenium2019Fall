package com.automation.tests.day9;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTests {
private WebDriver driver;
@BeforeMethod
public void setup () {
driver = DriverFactory.createDriver("chrome");

}
@Test
public void hoverOnImage() throws Exception {
driver.get(" http://practice.cybertekschool.com/hovers ");
    BrowserUtils.wait(3);

}
@AfterMethod
    public void teardown(){

    driver.quit();
}
}