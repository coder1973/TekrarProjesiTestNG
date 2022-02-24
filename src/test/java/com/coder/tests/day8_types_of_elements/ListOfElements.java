package com.coder.tests.day8_types_of_elements;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {
    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //save our web-elements inside the list
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        System.out.println("buttons.size() = " + buttons.size());

        //verify we have 6 buttons
        Assert.assertEquals(buttons.size(),6);

        //loop for each button, we can implement Selenium methods
        for (WebElement each:buttons) {
            System.out.println("button.isDisplayed() = " + each.isDisplayed());
            System.out.println(each.getText());
            Assert.assertTrue(each.isDisplayed());
        }

        //click only second button from the list
        buttons.get(1).click();

        driver.quit();
    }

    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        List<WebElement> buttons = driver.findElements(By.tagName("kjkjchskjdhkjdlkjd"));
        System.out.println("buttons.size() = " + buttons.size());

//        WebElement button = driver.findElement(By.tagName("ljdhqwkjdbdkjdhqkjd"));
//        get error bc
        driver.quit();

    }
}
