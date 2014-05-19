package com.baldurtech.yolo.shame;

public class FizzBuzzTest {
  public static void main(String[] args) {
    FizzBuzz app = new FizzBuzz();

    String expectedResult = "1";
    String actualResult = app.say(1);
    assertEquals(expectedResult, actualResult);

    System.out.println("Fizz".equals(app.say(3)));
    System.out.println("Buzz".equals(app.say(5)));
    System.out.println("Buzz".equals(app.say(10)));
    System.out.println("FizzBuzz".equals(app.say(15)));
  }

  public static void assertEquals(String expectedResult, String actualResult) {
    System.out.println(expectedResult.equals(actualResult));
  }
}
