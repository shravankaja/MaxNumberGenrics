package com.maxnumber;

public class MaxNumber {

    public static <E extends Comparable> E findMaxGenric(E firstElement, E secondElement, E thirdElement) {
        E max = firstElement;
        if ((secondElement.compareTo(max)) > 0) {
            max = secondElement;
        }
        if ((thirdElement.compareTo(max)) > 0) {
            max = thirdElement;
        }
        printMaxGeneric(firstElement, secondElement, thirdElement, max);
        return max;
    }

    public static <E> void printMaxGeneric(E firstElement, E secondElement, E thirdElement, E max) {
        System.out.println("Enter Integers numbers are : " + firstElement + " " + secondElement + " " + thirdElement + " Max is :" + max);
    }

    public static void main(String Args[]) {
        System.out.println("Welcome to Max Number Program");
        Integer firstNumber = Integer.valueOf("199");
        Integer secondNumber = Integer.valueOf("20");
        Integer thirdNumber = Integer.valueOf("100");
        findMaxGenric(firstNumber, secondNumber, thirdNumber);
        Float firstNumberFloat = Float.valueOf("24.9");
        Float secondNumberFloat = Float.valueOf("10.7");
        Float thirdNumberFloat = Float.valueOf("69.4");
        findMaxGenric(firstNumberFloat, secondNumberFloat, thirdNumberFloat);
        String firstString = String.valueOf("sasasassaqwqdqdcacacasaasdqwqccqqwqwsxsa");
        String secondString = String.valueOf("HelloShravan");
        String thirdString = String.valueOf("HelloWorld");
        findMaxGenric(firstString, secondString, thirdString);
    }
}
