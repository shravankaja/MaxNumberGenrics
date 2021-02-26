package com.maxnumber;

import org.junit.jupiter.api.*;

public class MaxNumberTest {
    MaxNumber maxNumber = new MaxNumber();
    Integer resultNumber;

    @Test
    public void maxNumberFirstPosition() {
        resultNumber = maxNumber.findMaxNumber(199, 22, 1);
        Assertions.assertEquals(199, resultNumber);
    }

    @Test
    public void maxNumberSecondPosition() {
        resultNumber = maxNumber.findMaxNumber(149, 264, 156);
        Assertions.assertEquals(264, resultNumber);
    }

    @Test
    public void maxNumberThirdPosition() {
        resultNumber = maxNumber.findMaxNumber(147, 97, 360);
        Assertions.assertEquals(360, resultNumber);
    }
}
