package com.baldurtech.yolo.shame;

public class FizzBuzzTest {
    static Boolean testResult = true;
    static Integer countSuccess = 0;
    static Integer countFail = 0;

    public static void main(String[] args) {
        runTest();
    }

    public static void runTest() {
        FizzBuzz app = new FizzBuzz();

        assertEquals("1", app.say(1));
        assertEquals("Fizz", app.say(3));
        assertEquals("Buzz", app.say(5));
        assertEquals("Fizz", app.say(42));
        assertEquals("Buzz", app.say(10));
        assertEquals("FizzBuzz", app.say(15));

        outputTestReport();
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
        System.out.println("Test result: " + (testResult ? "SUCCESS" : "FAIL"));
        System.out.println("Test pass: " + countSuccess + ", test fail: " + countFail);
    }
}
