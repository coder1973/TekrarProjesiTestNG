package com.coder.tests.day8_types_of_elements;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public void test(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement radioButton = driver.findElement(By.id("blue"));

        //get the value of type attribute
        System.out.println(radioButton.getAttribute("type"));
        //get the value of name attribute
        System.out.println(radioButton.getAttribute("name"));
        //get the value of checked
        //since checked attribute does not keep any value it will return true of false based on the condition
        System.out.println(radioButton.getAttribute("checked"));

        //trying to get attribute does not exist
        //when we use non-exist attribute it will retunr NULL to us
        System.out.println(radioButton.getAttribute("href"));
        System.out.println(radioButton.getAttribute("outerHTML"));
        driver.quit();
    }
}
