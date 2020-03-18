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


         driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Thread.sleep(3000);//for demo, wait 3 seconds

        String title = driver.getTitle();//returns <title>Some title</title> text

String expectedTitle = " Google";



        System.out.println("Title is..."+title);


        if(expectedTitle.equals(title)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

driver.navigate() .to(" http://amazon.com");
        Thread.sleep(3000);//for demo, wait 3 seconds

        if(driver.getTitle().toLowerCase().contains("amazon")) {
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED!");
        }

        driver.navigate().back();
        verifyEquals(driver. getTitle(),"Google");



        driver.close();
        //browser cannot close itself
    }
public static void verifyEquals(String arg1,String arg2) {
        if(arg1.equals(arg2)){
            System.out.println("test passed");

        }else {
            System.out.println("test failed");
        }
}

}