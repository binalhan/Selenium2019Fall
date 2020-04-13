package com.automation.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

        @org.jetbrains.annotations.NotNull
        public static WebDriver createDriver(String browserName){

  if (browserName.equalsIgnoreCase("chrome")){
      ChromeDriver chromeDriver= new ChromeDriver();
      return chromeDriver;
  }else{
      WebDriverManager.firefoxdriver().setup();
      return new FirefoxDriver();

  }

        }




}