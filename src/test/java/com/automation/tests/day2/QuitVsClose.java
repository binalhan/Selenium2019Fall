package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class QuitVsClose {


    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertek.com/open_nw_tab");
        Thread.sleep (5000);
        driver.close();







    }

}

