package com.demoqa.automation.utils;

public class Javascrip {
    public static  void  waitFor(int millis)  {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
