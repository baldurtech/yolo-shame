package com.baldurtech.yolo.shame;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz app = new FizzBuzz();

        assertEquals("1", app.say(1));
        assertEquals("Fizz", app.say(3));
        assertEquals("Buzz", app.say(5));
        assertEquals("Buzz", app.say(10));
        assertEquals("FizzBuzz", app.say(15));
    }

    public static void assertEquals(String expectedResult, String actualResult) {
        System.out.println(expectedResult.equals(actualResult));
    }
}
