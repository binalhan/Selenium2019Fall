package com.automation.tests.day6;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.automation.utilities.DriverFactory.createDriver;

public class SelectByText {

    public static void main(String[] args) throws Exception {
        WebDriver driver = createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);


        WebElement simpleDropdown =driver.findElement(By.id("dropdown"));
        Select selectSimpleDropdown= new Select(simpleDropdown);
        selectSimpleDropdown.selectByVisibleText("option 2");
        selectSimpleDropdown.selectByVisibleText("option 1");


        Select selectYear = new Select(driver.findElement(By.id("year")));
        Select selectMonth = new Select(driver.findElement(By.id("month")));
        Select selectDay = new Select(driver.findElement(By.id("day")));

        selectDay.selectByVisibleText("1");
        selectMonth.selectByVisibleText("March");
        selectYear.selectByVisibleText("2013");

        List<WebElement> months = selectMonth.getOptions();
        for (WebElement eachMonth: months){
            String monthName= eachMonth.getText();
            selectDay.selectByVisibleText(monthName);
        }
        BrowserUtils.wait(1);


        driver.quit();

    }



}