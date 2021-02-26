package com.maxnumber;

public class MaxNumber {

    public static Integer findMaxNumber(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if ((thirdNumber.compareTo(max)) > 0) {
            max = thirdNumber;
        }
        printMax(firstNumber, secondNumber, thirdNumber, max);
        return max;
    }

    public static Float findFloatMaxNumber(Float firstFloatNumber, Float secondFloatNumber, Float thirdFloatNumber) {
        Float max = firstFloatNumber;
        if (secondFloatNumber.compareTo(max) > 0) {
            max = secondFloatNumber;
        }
        if ((thirdFloatNumber.compareTo(max)) > 0) {
            max = thirdFloatNumber;
        }
        printMax(firstFloatNumber, secondFloatNumber, thirdFloatNumber, max);
        return max;
    }


    public static void printMax(Integer firstNumber, Integer secondNumber, Integer thirdNumber, Integer max) {
        System.out.println("Enter Integers numbers are : " + firstNumber + " " + secondNumber + " " + thirdNumber + " Max is" + max);

    }

    public static void printMax(Float firstNumberFloat, Float secondNumberFloat, Float thirdNumberFloat, Float max) {
        System.out.println("Enter Float numbers are : " + firstNumberFloat + " " + secondNumberFloat + " " +
                thirdNumberFloat + " Max is" + max);

    }

    public static void main(String Args[]) {
        System.out.println("Welcome to Max Number Program");
        Integer firstNumber = Integer.valueOf("199");
        Integer secondNumber = Integer.valueOf("20");
        Integer thirdNumber = Integer.valueOf("100");
        findMaxNumber(firstNumber, secondNumber, thirdNumber);
        Float firstNumberFloat = Float.valueOf("24.9");
        Float secondNumberFloat = Float.valueOf("10.7");
        Float thirdNumberFloat = Float.valueOf("69.4");
        findFloatMaxNumber(firstNumberFloat,secondNumberFloat,thirdNumberFloat);
    }


}
