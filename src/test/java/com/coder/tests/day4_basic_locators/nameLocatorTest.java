package com.coder.tests.day4_basic_locators;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullNameButton = driver.findElement(By.name("full_name"));
        fullNameButton.sendKeys("Hasan");
        WebElement emailButton = driver.findElement(By.name("email"));
        emailButton.sendKeys("hasan@gmail.com");
        driver.findElement(By.name("wooden_spoon")).click();
        String expectedMessage="Thank you for signing up. Click the button below to return to the home page.";
        String actualMessage = driver.findElement(By.name("signup_message")).getText();
        if(actualMessage.equals(expectedMessage)){
            System.out.println("Pass");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }else{
            System.out.println("Fail");
        }
        driver.quit();
    }
}
