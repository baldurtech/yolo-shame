package com.baldurtech.yolo.shame;

public class FizzBuzz {
    public String say(Integer num) {
        return num % 15 == 0 ? "FizzBuzz" : num % 3 == 0 ? "Fizz" : num % 5 == 0 ? "Buzz" : String.valueOf(num);
  }
}
