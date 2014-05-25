package com.baldurtech.yolo.shame;

public abstract class YoloTestCase {
    static Boolean testResult = true;
    static Integer countSuccess = 0;
    static Integer countFail = 0;

    public static void assertEquals(String expectedResult, String actualResult) {
        if(expectedResult.equals(actualResult)) {
            countSuccess ++;
        } else {
            countFail ++;
            System.out.println("Expected `" + expectedResult + "', but result is `" + actualResult + "'");
            testResult = false;
        }
    }
}
