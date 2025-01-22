package com.swiggy;

public class DivisibleByThreeAndFive {
    public String check(int i) {
        if(i<1) {
            throw new IllegalArgumentException();
        }
        if(i%3==0 && i%5==0) {
            return "FizzBuzz";
        }
        if(i%3==0) {
            return "Fizz";
        }
        if(i%5==0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }
}
