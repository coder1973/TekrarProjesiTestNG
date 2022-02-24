package com.coder.tests.day5_xpath;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HW_TestCase2 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //go to wikipedia
        driver.get("https://www.wikipedia.org/");
        //enter search term 'selenium webdriver'
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("selenium webdriver");
        //click on search result 'Selenium (software)'
        driver.findElement(By.xpath("//i[@data-jsl10n='search-input-button']")).click();
       //verify url ends with Selenium_(software)
        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.endsWith("search=selenium+webdriver&go=Go&ns0=1")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("currentUrl ends with " + currentUrl);
        }
        driver.quit();
    }
}
