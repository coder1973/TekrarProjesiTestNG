package com.coder.tests.day7_testing;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FirstTestNGTest {

    @Test
    public void test1(){
        System.out.println("First Test"); //test code here
    }
    @Ignore
    @Test
    public void test2(){
        System.out.println("Second Test");
    }

    @Test
    public void test3(){
        System.out.println("Third Test");
    }
}
