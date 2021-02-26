package com.maxnumber;

import org.junit.jupiter.api.*;

public class MaxNumberTest {
    MaxNumber maxNumber = new MaxNumber();
    Integer resultNumber;
    Float resultFloatNumber;

    @Test
    public void maxNumberFirstPosition() {
        resultNumber = maxNumber.findMaxNumber(199, 9, 145);
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

    @Test
    public void maxFloatNumberTest() {
        Float firstNumberFloat = Float.valueOf("24.9");
        Float secondNumberFloat = Float.valueOf("10.7");
        Float thirdNumberFloat = Float.valueOf("69.4");
        resultFloatNumber = maxNumber.findFloatMaxNumber(firstNumberFloat,secondNumberFloat,thirdNumberFloat);
        Assertions.assertEquals(thirdNumberFloat, resultFloatNumber);
    }
}
