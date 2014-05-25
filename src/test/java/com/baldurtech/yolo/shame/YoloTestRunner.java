package com.baldurtech.yolo.shame;

import java.lang.reflect.Method;

public class YoloTestRunner {
    public static void main(String[] args) {
        try {
            for(String clazzName: args) {
                YoloTestCase testCase = (YoloTestCase) Class.forName(clazzName).newInstance();
                runTest(testCase.getClass());
            }
        } catch(Exception e) {

        }
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

    public static void outputTestReport() {
        System.out.println("Test result: " + (YoloTestCase.testResult ? "SUCCESS" : "FAIL"));
        System.out.println("Test pass: " + YoloTestCase.countSuccess + ", test fail: " + YoloTestCase.countFail);
    }

}
