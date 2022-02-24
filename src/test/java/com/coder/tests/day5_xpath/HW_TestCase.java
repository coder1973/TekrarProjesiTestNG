package com.coder.tests.day5_xpath;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HW_TestCase {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //go to amazon
        driver.get("https://www.amazon.com/");
        //go to ebay
        //driver.get("https://www.ebay.com/");
        //enter search term "macbook" click on search button
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook");
        driver.findElement(By.id("nav-search-submit-button")).click();
        boolean contains = driver.getTitle().contains("macbook");
        if (contains=true){
            System.out.println("title contains \"macbook\" " + contains);
        }else{
            System.out.println("title contains \"macbook\" " + contains);
        }
        driver.quit();

    }
}
