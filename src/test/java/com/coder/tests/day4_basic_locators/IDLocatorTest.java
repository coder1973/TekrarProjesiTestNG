package com.coder.tests.day4_basic_locators;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement dontclickbutton = driver.findElement(By.id("disappearing_button"));
        dontclickbutton.click();
        driver.quit();

    }
}
