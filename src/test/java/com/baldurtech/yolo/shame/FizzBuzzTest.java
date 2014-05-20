package com.baldurtech.yolo.shame;

public class FizzBuzzTest {
    static Boolean testResult = true;
    static Integer countSuccess = 0;
    static Integer countFail = 0;

    public static void main(String[] args) {
        runTest();
    }

    public static void runTest() {
        new FizzBuzzTest().test_1();

        new FizzBuzzTest().test_3();

        new FizzBuzzTest().test_5();

        new FizzBuzzTest().test_42();

        new FizzBuzzTest().test_10();

        new FizzBuzzTest().test_15();

        outputTestReport();
    }

    FizzBuzz app = new FizzBuzz();

    public void test_1() {
        assertEquals("1", app.say(1));
    }

    public void test_3() {
        assertEquals("Fizz", app.say(3));
    }

    public void test_5() {
        assertEquals("Buzz", app.say(5));
    }

    public void test_42() {
        assertEquals("Fizz", app.say(42));
    }

    public void test_10() {
        assertEquals("Buzz", app.say(10));
    }

    public void test_15() {
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
