package com.baldurtech.yolo.shame;

public class FizzBuzzTest extends YoloTestCase {
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

    public void test_fortytwo() {
        FizzBuzz app = new FizzBuzz();
        assertEquals("Fizz", app.say(42));
        assertEquals("Fizz", app.say(42));
    }

    public void test_10() {
        assertEquals("Buzz", app.say(10));
    }

    public void test_15() {
        assertEquals("FizzBuzz", app.say(15));
    }
}
