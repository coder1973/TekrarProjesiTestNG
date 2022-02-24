package com.coder.tests.day6_css;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssDemo {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement donClick = driver.findElement(By.cssSelector("#disappearing_button"));
        System.out.println("donClick.getText() = " + donClick.getText());
        driver.quit();
    }
}
