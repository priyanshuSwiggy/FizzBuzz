package com.swiggy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DivisibleByThreeFiveSevenTest {

    @Test
    public void testExceptionThrownWhenInputNegative() {
        DivisibleByThreeFiveSeven divisibleByThreeFiveSeven = new DivisibleByThreeFiveSeven();

        assertThrows(IllegalArgumentException.class, () -> divisibleByThreeFiveSeven.check(-1));
    }

    @Test
    public void testExceptionThrownWhenInputZero() {
        DivisibleByThreeFiveSeven divisibleByThreeFiveSeven = new DivisibleByThreeFiveSeven();

        assertThrows(IllegalArgumentException.class, () -> divisibleByThreeFiveSeven.check(0));
    }

    @Test
    public void testReturnOneWhenInputOne() {
        DivisibleByThreeFiveSeven divisibleByThreeFiveSeven = new DivisibleByThreeFiveSeven();

        String result = divisibleByThreeFiveSeven.check(1);

        assertEquals("1", result);
    }

    @Test
    public void testReturnFizzWhenInputThree() {
        DivisibleByThreeFiveSeven divisibleByThreeFiveSeven = new DivisibleByThreeFiveSeven();

        String result = divisibleByThreeFiveSeven.check(3);

        assertEquals("Fizz", result);
    }

    @Test
    public void testReturnBuzzWhenInputFive() {
        DivisibleByThreeFiveSeven divisibleByThreeFiveSeven = new DivisibleByThreeFiveSeven();

        String result = divisibleByThreeFiveSeven.check(5);

        assertEquals("Buzz", result);
    }

    @Test
    public void testReturnFizzBuzzWhenInputFifteen() {
        DivisibleByThreeFiveSeven divisibleByThreeFiveSeven = new DivisibleByThreeFiveSeven();

        String result = divisibleByThreeFiveSeven.check(15);

        assertEquals("FizzBuzz", result);
    }

    @Test
    public void testReturnFourWhenInputFour() {
        DivisibleByThreeFiveSeven divisibleByThreeFiveSeven = new DivisibleByThreeFiveSeven();

        String result = divisibleByThreeFiveSeven.check(4);

        assertEquals("4", result);
    }

    @Test
    public void testReturnFizzWhenInputSix() {
        DivisibleByThreeFiveSeven divisibleByThreeFiveSeven = new DivisibleByThreeFiveSeven();

        String result = divisibleByThreeFiveSeven.check(6);

        assertEquals("Fizz", result);
    }

    @Test
    public void testReturnBuzzWhenInputTen() {
        DivisibleByThreeFiveSeven divisibleByThreeFiveSeven = new DivisibleByThreeFiveSeven();

        String result = divisibleByThreeFiveSeven.check(10);

        assertEquals("Buzz", result);
    }

    @Test
    public void testReturnFizzBuzzWhenInputThirty() {
        DivisibleByThreeFiveSeven divisibleByThreeFiveSeven = new DivisibleByThreeFiveSeven();

        String result = divisibleByThreeFiveSeven.check(30);

        assertEquals("FizzBuzz", result);
    }

    @Test
    public void testReturnSixteenWhenInputSixteen() {
        DivisibleByThreeFiveSeven divisibleByThreeFiveSeven = new DivisibleByThreeFiveSeven();

        String result = divisibleByThreeFiveSeven.check(16);

        assertEquals("16", result);
    }

    @Test
    public void testReturnElevenWhenInputEleven() {
        DivisibleByThreeFiveSeven divisibleByThreeFiveSeven = new DivisibleByThreeFiveSeven();

        String result = divisibleByThreeFiveSeven.check(11);

        assertEquals("11", result);
    }

    @Test
    public void testReturnBangWhenInputSeven() {
        DivisibleByThreeFiveSeven divisibleByThreeFiveSeven = new DivisibleByThreeFiveSeven();

        String result = divisibleByThreeFiveSeven.check(7);

        assertEquals("Bang", result);
    }

    @Test
    public void testReturnBangWhenInputFourteen() {
        DivisibleByThreeFiveSeven divisibleByThreeFiveSeven = new DivisibleByThreeFiveSeven();

        String result = divisibleByThreeFiveSeven.check(14);

        assertEquals("Bang", result);
    }

    @Test
    public void testReturnFizzBangWhenInputTwentyOne() {
        DivisibleByThreeFiveSeven divisibleByThreeFiveSeven = new DivisibleByThreeFiveSeven();

        String result = divisibleByThreeFiveSeven.check(21);

        assertEquals("FizzBang", result);
    }
}
