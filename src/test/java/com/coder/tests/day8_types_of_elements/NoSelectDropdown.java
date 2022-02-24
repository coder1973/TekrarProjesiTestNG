package com.coder.tests.day8_types_of_elements;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1. locate your dropdown just like any other web element with unique locator
        WebElement dropdownElement = driver.findElement(By.cssSelector("#dropdownMenuLink"));
        dropdownElement.click();

        List<WebElement> dropdownOptions = driver.findElements(By.cssSelector(".dropdown-item"));
        //print each option

        for (WebElement option:dropdownOptions) {
            System.out.println("option.getText() = " + option.getText());

        }
        //click yahoo link
        dropdownOptions.get(2).click();

        for (int i = 0; i < dropdownOptions.size(); i++) {
            System.out.println("dropdownOptions: "+i+" = " + dropdownOptions.get(i).getText());

        }

        driver.quit();
    }
}
