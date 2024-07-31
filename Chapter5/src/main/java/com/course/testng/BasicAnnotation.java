package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test//最基本的注解，用来把方法标记为测试的一部分
    public void testCase1(){
        System.out.println("这是testCase1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是testCase2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod运行了");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod运行了");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass在类运行之前运行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass在类运行之后运行");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuit测试套件");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("afterSuit测试套件");
    }
}
