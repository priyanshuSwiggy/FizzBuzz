package com.swiggy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DivisibleByThreeAndFiveTest {

    @Test
    public void testExceptionThrownWhenInputNegative() {
        DivisibleByThreeAndFive divisibleByThreeAndFive = new DivisibleByThreeAndFive();

        assertThrows(IllegalArgumentException.class, () -> divisibleByThreeAndFive.check(-1));
    }

    @Test
    public void testExceptionThrownWhenInputZero() {
        DivisibleByThreeAndFive divisibleByThreeAndFive = new DivisibleByThreeAndFive();

        assertThrows(IllegalArgumentException.class, () -> divisibleByThreeAndFive.check(0));
    }

    @Test
    public void testReturnOneWhenInputOne() {
        DivisibleByThreeAndFive divisibleByThreeAndFive = new DivisibleByThreeAndFive();

        String result = divisibleByThreeAndFive.check(1);

        assertEquals("1", result);
    }

    @Test
    public void testReturnFizzWhenInputThree() {
        DivisibleByThreeAndFive divisibleByThreeAndFive = new DivisibleByThreeAndFive();

        String result = divisibleByThreeAndFive.check(3);

        assertEquals("Fizz", result);
    }
}
