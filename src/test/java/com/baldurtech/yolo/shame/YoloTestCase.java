package com.baldurtech.yolo.shame;

import java.util.List;

public abstract class YoloTestCase {
    static Boolean testResult = true;
    static Integer countSuccess = 0;
    static Integer countFail = 0;

    public static void assertEquals(String expectedResult, String actualResult) {
        assertEquals(expectedResult, actualResult, expectedResult.equals(actualResult));
    }

    public static void assertEquals(List expectedResult, List actualResult) {
        Boolean isEquals = expectedResult.size() == actualResult.size();
        if(isEquals) {
            for(int i = 0; i < expectedResult.size(); i++) {
                if(! equals(expectedResult.get(i), actualResult.get(i))) {
                    isEquals = false;
                    break;
                }
            }
        }
        assertEquals(expectedResult.toString(), actualResult.toString(), isEquals);
    }

    private static Boolean equals(Object a, Object b) {
        if(a == null) {
            return b == null;
        }
        return a.equals(b);
    }

    private static void assertEquals(String expectedResult, String actualResult,
                                     Boolean resultIsEquals) {
        if(resultIsEquals) {
            countSuccess ++;
        } else {
            countFail ++;
            System.out.println("Expected `" + expectedResult + "', but result is `" + actualResult + "'");
            testResult = false;
        }
    }
}
