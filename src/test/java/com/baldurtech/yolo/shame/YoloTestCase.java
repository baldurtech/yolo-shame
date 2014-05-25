package com.baldurtech.yolo.shame;

import java.lang.reflect.Method;

public abstract class YoloTestCase {
    static Boolean testResult = true;
    static Integer countSuccess = 0;
    static Integer countFail = 0;

    public static void main(String[] args) {
        runTest(FizzBuzzTest.class);
    }

    public static void runTest(Class testCaseClazz) {
        if(testCaseClazz.getSuperclass() != YoloTestCase.class) {
            return;
        }
        Method[] methods = testCaseClazz.getDeclaredMethods();
        for(Method method: methods) {
            System.out.println("method: " + method.getName());
            if(method.getName().startsWith("test")) {
                System.out.println("  invoke: " + method.getName());
                try {
                    /*
                       下面的代码等同于 new FizzBuzzTest().method()
                       但是这个 method 是一个以 test 开头的方法，而且没有参数。
                     */
                    method.invoke(testCaseClazz.newInstance());
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }

        outputTestReport();
    }

    public static void runTest(YoloTestCase yoloTestCase) {
        runTest(yoloTestCase.getClass());
    }

    public static void assertEquals(String expectedResult, String actualResult) {
        if(expectedResult.equals(actualResult)) {
            countSuccess ++;
        } else {
            countFail ++;
            System.out.println("Expected " + expectedResult + ", but result is " + actualResult);
            testResult = false;
        }
    }

    public static void outputTestReport() {
        System.out.println("Test result: " + (YoloTestCase.testResult ? "SUCCESS" : "FAIL"));
        System.out.println("Test pass: " + YoloTestCase.countSuccess + ", test fail: " + YoloTestCase.countFail);
    }

}
