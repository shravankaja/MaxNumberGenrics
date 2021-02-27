package com.maxnumber;

import org.junit.jupiter.api.*;

public class MaxNumberTest {
    Integer resultNumber;
    Float resultFloatNumber;
    String resultString;

    @Test
    public void maxNumberFirstPosition() {
        resultNumber = MaxNumber.findMaxGenricTest(10, 20, 30);
        Assertions.assertEquals(30, resultNumber);
    }

    @Test
    public void maxStringTest() {
        resultString = MaxNumber.findMaxGenricTest("Shravan", "Kaja");
        Assertions.assertEquals("Shravan", resultString);

    }
}