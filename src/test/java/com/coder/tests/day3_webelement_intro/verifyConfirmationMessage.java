package com.coder.tests.day3_webelement_intro;

import com.coder.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {

    public static void main(String[] args) {
        /**
         * Verify confirmation message
         * open browser
         * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
         * enter any email
         * verify that email is displayed in the input box
         * click on Retrieve password
         * verify that confirmation message says 'Your e-mail's been sent!'
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailBox = driver.findElement(By.xpath("//input[@name='email']"));
        String expectedEmail = "hasan@gmail.com";
        emailBox.sendKeys(expectedEmail);
        //String actualEmail = emailBox.getText();
        String actualEmail = emailBox.getAttribute("value");
        System.out.println("actualEmail = " + actualEmail);
        if (actualEmail.equals(expectedEmail)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        WebElement retrievePasswordElement = driver.findElement(By.xpath("//i[.='Retrieve password']"));
        retrievePasswordElement.click();

        WebElement message = driver.findElement(By.tagName("h4"));
        String expectedMessage = "Your e-mail's been sent1!";
        String currentMessage = message.getText();
        if(currentMessage.equals(expectedMessage)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("currentMessage = " + currentMessage);
        }
        driver.quit();
    }
}
