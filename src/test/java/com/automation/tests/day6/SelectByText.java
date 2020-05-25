package com.automation.tests.day6;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static com.automation.utilities.DriverFactory.createDriver;
import java.util.List;

public class SelectByText {

    public static void main(String[] args) throws Exception {
        WebDriver driver = DriverFactory.createDriver("chrome");
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
            java.lang.String monthName= eachMonth.getText();
            selectMonth.selectByVisibleText(monthName);
            BrowserUtils.wait(1);


        }
        BrowserUtils.wait(3);
        Select stateSelect = new Select (driver.findElement(By.id("state")));
       stateSelect.selectByVisibleText("district of Columbia");

        java.lang.String selected = stateSelect.getFirstSelectedOption().getText();

                if(selected.equals("District of Columbia")){
                    System.out.println("Test passed");

                }else{
                    System.out.println("test failed ");
                }


        BrowserUtils.wait(3);
        driver.quit();

    }



}