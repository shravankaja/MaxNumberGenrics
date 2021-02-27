package com.maxnumber;

import org.junit.jupiter.api.*;

public class MaxNumberTest {
    Integer resultNumber;
    Float resultFloatNumber;
    String resultString;

    @Test
    public void maxNumberFirstPosition() {
        resultNumber = MaxNumber.findMaxGenric(199, 9, 145);
        Assertions.assertEquals(199, resultNumber);
    }

    @Test
    public void maxNumberSecondPosition() {
        resultNumber = MaxNumber.findMaxGenric(149, 264, 156);
        Assertions.assertEquals(264, resultNumber);
    }

    @Test
    public void maxNumberThirdPosition() {
        resultNumber = MaxNumber.findMaxGenric(147, 97, 360);
        Assertions.assertEquals(360, resultNumber);
    }

    @Test
    public void maxFloatNumberFirstPositionTest() {
        Float firstNumberFloat = Float.valueOf("124.9");
        Float secondNumberFloat = Float.valueOf("10.7");
        Float thirdNumberFloat = Float.valueOf("69.4");
        resultFloatNumber = MaxNumber.findMaxGenric(firstNumberFloat, secondNumberFloat, thirdNumberFloat);
        Assertions.assertEquals(firstNumberFloat, resultFloatNumber);
    }

    @Test
    public void maxFloatNumberSecondPositionTest() {
        Float firstNumberFloat = Float.valueOf("24.9");
        Float secondNumberFloat = Float.valueOf("101.7");
        Float thirdNumberFloat = Float.valueOf("69.4");
        resultFloatNumber = MaxNumber.findMaxGenric(firstNumberFloat, secondNumberFloat, thirdNumberFloat);
        Assertions.assertEquals(secondNumberFloat, resultFloatNumber);
    }

    @Test
    public void maxFloatNumberThirdPositionTest() {
        Float firstNumberFloat = Float.valueOf("11.9");
        Float secondNumberFloat = Float.valueOf("110.7");
        Float thirdNumberFloat = Float.valueOf("169.4");
        resultFloatNumber = MaxNumber.findMaxGenric(firstNumberFloat, secondNumberFloat, thirdNumberFloat);
        Assertions.assertEquals(thirdNumberFloat, resultFloatNumber);
    }

    @Test
    public void maxStringFirstPositionTest() {
        resultString = MaxNumber.findMaxGenric("wa", "h", "s");
        Assertions.assertEquals("wa", resultString);
    }

    @Test
    public void maxStringSecondPositionTest() {
        resultString = MaxNumber.findMaxGenric("h", "wa", "s");
        Assertions.assertEquals("wa", resultString);
    }

    @Test
    public void maxStringThirdPositionTest() {
        resultString = MaxNumber.findMaxGenric("w", "h", "wa");
        Assertions.assertEquals("wa", resultString);
    }

}