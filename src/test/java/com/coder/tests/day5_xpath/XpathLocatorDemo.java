package com.coder.tests.day5_xpath;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathLocatorDemo {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement buttonElement2 = driver.findElement(By.xpath("//button[@onclick='button2()']"));
        buttonElement2.click();
        driver.quit();
    }
}
