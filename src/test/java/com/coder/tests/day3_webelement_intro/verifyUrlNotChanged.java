package com.coder.tests.day3_webelement_intro;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlNotChanged {

    /**
     *Verify URL not changed
     * open chrome browser
     * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
     * click on Retrieve password
     * verify that url did not change
     */

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String expectedUrl = driver.getCurrentUrl();
        WebElement retrieveButton = driver.findElement(By.cssSelector("#form_submit i"));
        retrieveButton.click();

        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals(expectedUrl)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        driver.quit();
    }
}
