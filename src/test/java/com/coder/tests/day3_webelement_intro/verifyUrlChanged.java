package com.coder.tests.day3_webelement_intro;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlChanged {
    public static void main(String[] args) throws InterruptedException {
//                Verify URL changed
//                * open browser
//                * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
//                * enter any email
//                * click on Retrieve password
//                * verify that url changed to http://practice.cybertekschool.com/email_sent

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailBox = driver.findElement(By.xpath("//input[@type='text']"));
        emailBox.sendKeys("emailxxx@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#form_submit i")).click();
        String expectedUrl = "http://practice.cybertekschool.com/email_sent";
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals(expectedUrl)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("currentUrl = " + currentUrl);
            System.out.println("expectedUrl = " + expectedUrl);
        }
         driver.quit();
        }

    }
