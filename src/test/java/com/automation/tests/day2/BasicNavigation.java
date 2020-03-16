package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasicNavigation {

    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get ("http://google.com");
        Thread.sleep(3000);//for demo, wait 3 seconds

        driver.close();
        String title = driver.getTitle();//returns <title>Some title</title> text
        System.out.println("Title is..."+title);
        driver.close();//to close browser
        //browser cannot close itself
    }


}