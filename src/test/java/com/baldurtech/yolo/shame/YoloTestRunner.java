package com.baldurtech.yolo.shame;

public class YoloTestRunner {
    public static void main(String[] args) {
        try {
            for(String clazzName: args) {
                YoloTestCase testCase = (YoloTestCase) Class.forName(clazzName).newInstance();
                testCase.runTest(testCase.getClass());
            }
        } catch(Exception e) {

        }
    }
}
