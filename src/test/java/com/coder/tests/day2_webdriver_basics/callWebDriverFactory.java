package com.coder.tests.day2_webdriver_basics;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class callWebDriverFactory {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
    }
}
