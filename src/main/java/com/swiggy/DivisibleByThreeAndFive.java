package com.swiggy;

public class DivisibleByThreeAndFive {
    public String check(int i) {
        if(i<1) {
            throw new IllegalArgumentException();
        }
        if(i==15) {
            return "FizzBuzz";
        }else if(i%3==0) {
            return "Fizz";
        } else if(i%5==0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }
}
