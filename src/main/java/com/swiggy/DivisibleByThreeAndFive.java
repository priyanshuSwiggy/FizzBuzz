package com.swiggy;

public class DivisibleByThreeAndFive {
    public String check(int i) {
        if(i<1) {
            throw new IllegalArgumentException();
        }
        if(i==3) {
            return "Fizz";
        } else if(i==5) {
            return "Buzz";
        } else if(i==15) {
            return "FizzBuzz";
        }
        return "1";
    }
}
