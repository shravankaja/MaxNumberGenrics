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

    public static void printMax(Integer firstNumber, Integer secondNumber, Integer thirdNumber, Integer max) {
        System.out.println("Enter numbers are : " + firstNumber + " " + secondNumber + " " + thirdNumber + " Max is" + max);

    }

    public static void main(String Args[]) {
        System.out.println("Welcome to Max Number Program");
        Integer firstNumber = Integer.valueOf("199");
        Integer secondNumber = Integer.valueOf("20");
        Integer thirdNumber = Integer.valueOf("100");
        findMaxNumber(firstNumber, secondNumber, thirdNumber);
    }
}
