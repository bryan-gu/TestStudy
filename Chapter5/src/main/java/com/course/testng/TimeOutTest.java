package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 3000)//单位为毫秒
    public void testSuccess() {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
        }
        System.out.println("成功");
    }

    @Test(timeOut = 3000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("失败");
    }
}
