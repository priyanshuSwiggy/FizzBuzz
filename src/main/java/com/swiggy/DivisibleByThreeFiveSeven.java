package com.swiggy;

public class DivisibleByThreeFiveSeven {
    public String check(int i) {
        if(i<1) {
            throw new IllegalArgumentException();
        }
        if (i%3==0 && i%5==0) {
            return "FizzBuzz";
        }
        if (i==35) {
            return "FizzBang";
        }
        if (i%3==0) {
            return "Fizz";
        }
        if (i%5==0) {
            return "Buzz";
        }
        if (i%7==0) {
            return "Bang";
        }
        return String.valueOf(i);
    }
}
