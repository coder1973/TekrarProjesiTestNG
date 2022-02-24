package com.coder.tests.day8_types_of_elements;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1.locate your dropdown just like any other web element with unique locator
        WebElement dropdownElement = driver.findElement(By.cssSelector("#state"));
        //2. create Select object by passing that element as a constructor
        Select stateDropdown = new Select(dropdownElement);
        //get options--->returns all the available options from the dropdown list(state names here)
        List<WebElement> options = stateDropdown.getOptions();
        //print size of the options
        System.out.println("options.size() = " + options.size());
        //print options one by one
        for (WebElement option:options) {
            System.out.println("option.getText() = " + option.getText());
        }
        driver.quit();
    }
    @Test
    public void test2() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        //1.locate your dropdown just like any other web element with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));
        //2.create Select object by passing that element as a constructor
        Select stateDropdown = new Select(dropdownElement);
        //verify that first selection is select a state
        String expectedOption = "Select a State";
        String actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify first selection option");

        //HOW TO SELECT OPTIONS FROM DROPDOWN?
        //1.Select using visible text
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Virginia");
        expectedOption="Virginia";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption);

        //2.Select using index
        Thread.sleep(2000);
        stateDropdown.selectByIndex(51);
        expectedOption = "Wyoming";
        actualOption=stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption);

        //Select by value

        stateDropdown.selectByValue("DC");
        expectedOption="District Of Columbia";
        actualOption=stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption);

        Thread.sleep(2000);
        driver.quit();
    }
}
