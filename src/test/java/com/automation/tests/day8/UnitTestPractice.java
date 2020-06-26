package com.automation.tests.day8;

import org.testng.annotations.Test;

public class UnitTestPractice {
    public static void main(String[] args) {
        System.out.println(reverseString("apple"));
    }
    //annotation
    @Test(description = "Verify if method can reverse a string")
    public void test(){
    }
    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);


        }

        return reversed;
    }
}




