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


}
