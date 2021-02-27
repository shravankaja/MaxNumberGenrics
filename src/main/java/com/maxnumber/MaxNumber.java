package com.maxnumber;

public class MaxNumber<T extends Comparable> {

    T elementFirst, elementSecond, elementThird;

    public MaxNumber(T elementFirst, T elementSecond, T elementThird) {
        this.elementFirst = elementFirst;
        this.elementSecond = elementSecond;
        this.elementThird = elementThird;
    }

    public T maximum() {
        return MaxNumber.findMaxGenric(elementFirst, elementSecond, elementThird);
    }

    public static <T extends Comparable> T findMaxGenric(T firstElement, T secondElement, T thirdElement) {
        T max = firstElement;
        if ((secondElement.compareTo(max)) > 0) {
            max = secondElement;
        }
        if ((thirdElement.compareTo(max)) > 0) {
            max = thirdElement;
        }
        printMaxGeneric(firstElement, secondElement, thirdElement, max);
        return max;
    }

    public static <T> void printMaxGeneric(T firstElement, T secondElement, T thirdElement, T max) {
        System.out.println("Enter Integers numbers are : " + firstElement + " " + secondElement + " " + thirdElement + " Max is :" + max);
    }

    public static <T> void main(String Args[]) {
        Float firstNumberFloat = Float.valueOf("24.9");
        Float secondNumberFloat = Float.valueOf("14.5");
        Float thirdNumberFloat = Float.valueOf("14.9");
        MaxNumber<Integer> objInteger = new MaxNumber<>(5, 6, 7);
        MaxNumber<Float> objFloat = new MaxNumber<>(firstNumberFloat, secondNumberFloat, thirdNumberFloat);
        MaxNumber<String> objString = new MaxNumber<>("Apple", "Banana", "Peach");
        objInteger.maximum();
        objFloat.maximum();
        objString.maximum();

        new MaxNumber(1, 2, 3).maximum();
        new MaxNumber(firstNumberFloat, secondNumberFloat, thirdNumberFloat).maximum();
        new MaxNumber("Apple", "Shravan", "Kaja").maximum();
    }
}
