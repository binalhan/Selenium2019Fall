package com.automation.utilities;

public class BrowserUtils {


        public static void wait(int seconds)  throws Exception{
            try{
            Thread.sleep(1000*seconds);
    }catch ( InterruptedException e) {
            }
            }
}