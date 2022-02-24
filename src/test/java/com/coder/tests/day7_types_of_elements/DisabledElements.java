package com.coder.tests.day7_types_of_elements;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElements {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement greenradioButton = driver.findElement(By.cssSelector("#green"));

        //how to check web-element is enabled or not?
        System.out.println("Is element enabled = " + greenradioButton.isEnabled());
        Assert.assertFalse(greenradioButton.isEnabled(),"Verify Green is not enabled");
        Thread.sleep(3000);

        greenradioButton.click();
        Thread.sleep(3000);
    }
    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
        inputBox.sendKeys("Merhaba");
        driver.quit();
    }

}
