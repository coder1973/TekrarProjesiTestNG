package com.coder.tests.day7_testing;

import org.testng.annotations.*;

public class BeforeAfterTests {

    //For each test before we are doing something: Open browser, webdriver part, quit
    //Developers designed before and after methods to make our job easy to prevent repeat actions

    @Test
    public void test1(){
        System.out.println("This is my test 1");
    }

    @Ignore     //Ignore this test using this keyword
    @Test       //or just use // comment out
    public void test2(){
        System.out.println("This is my test 2");
    }

    @Test
    public void test3(){
        System.out.println("This is my test3");
    }
    @BeforeMethod
    public void setUp(){  //can put any name. It does not matter
        //Web driver part
        System.out.println("BEFORE METHOD HERE");
        System.out.println("WebDriver part");
    }
    @AfterMethod        //after method to quit the job.You can put any code inside like "driver.quit"
    public void tearDown(){
        System.out.println("AFTER METHOD HERE");
        System.out.println("Driver Quit");
    }
    @BeforeClass
    public void setUpClass(){   //the name doesn't matter you put yourself
        System.out.println("--BEFORE CLASS--");
        System.out.println("RUNS ONLY ONCE IN THE CLASS");
    }
    @AfterClass
    public void afterClass(){   //the name doesn't matter you put yourself
        System.out.println("--AFTER CLASS--");
        System.out.println("RUNS ONLY ONCE IN THE CLASS");
        System.out.println("GENERATE REPORT");
    }
}
