package com.baldurtech.yolo.shame;

public class FizzBuzzTest {
    static Boolean testResult = true;
    static Integer countSuccess = 0;
    static Integer countFail = 0;

    public static void main(String[] args) {
        runTest();
    }

    public static void runTest() {
        test_1();

        test_3();

        test_5();

        test_42();

        test_10();

        test_15();

        outputTestReport();
    }

    public static void test_1() {
        FizzBuzz app = new FizzBuzz();
        assertEquals("1", app.say(1));
    }

    public static void test_3() {
        FizzBuzz app = new FizzBuzz();
        assertEquals("Fizz", app.say(3));
    }

    public static void test_5() {
        FizzBuzz app = new FizzBuzz();
        assertEquals("Buzz", app.say(5));
    }

    public static void test_42() {
        FizzBuzz app = new FizzBuzz();
        assertEquals("Fizz", app.say(42));
    }

    public static void test_10() {
        FizzBuzz app = new FizzBuzz();
        assertEquals("Buzz", app.say(10));
    }

    public static void test_15() {
        FizzBuzz app = new FizzBuzz();
        assertEquals("FizzBuzz", app.say(15));
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
