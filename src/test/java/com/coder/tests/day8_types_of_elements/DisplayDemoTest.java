package com.coder.tests.day8_types_of_elements;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayDemoTest {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usernameInput = driver.findElement(By.cssSelector("#username"));
        System.out.println("usernameInput.isDisplayed() = " + usernameInput.isDisplayed());
        Assert.assertFalse(usernameInput.isDisplayed(),"username is not displayed");

        driver.findElement(By.xpath("//div[@id='start']//button")).click();
        Thread.sleep(5000);

        WebElement userName = driver.findElement(By.xpath("//label[@for='username']"));
        Assert.assertTrue(usernameInput.isDisplayed(),"username displayed");
        driver.quit();



    }
}
