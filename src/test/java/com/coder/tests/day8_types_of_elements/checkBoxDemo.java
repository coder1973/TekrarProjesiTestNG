package com.coder.tests.day8_types_of_elements;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkBoxDemo {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkBox1 = driver.findElement(By.id("box1"));
        WebElement checkBox2 = driver.findElement(By.id("box2"));

        //how to verify checkbox is selected or not?
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());
        Thread.sleep(3000);

        //verify checkbox1 is not selected, checkbox2 is selected
        Assert.assertFalse(checkBox1.isSelected(),"Verify checkbox1 is NOT selected");
        Assert.assertTrue(checkBox2.isSelected(),"Verify checkbox2 is selected ");

        //how to click checkbox?
        checkBox1.click();
        Thread.sleep(3000);

        //verify checkboxes again
        Assert.assertTrue(checkBox1.isSelected(),"Verify checkbox1 is selected");
        Assert.assertTrue(checkBox2.isSelected(),"Verify checkbox2 is selected");
        driver.quit();
    }
}
