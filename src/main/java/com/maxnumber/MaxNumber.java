package com.maxnumber;

public class MaxNumber<T extends Comparable> {

	public T[] elements;
	public T elementsTest;

	public MaxNumber(T... elements) {
		for (T e : elements) {
			this.elements = elements;
		}
	}

	public <T> void maximumArray() {

		MaxNumber.findMaxGenric(elements);
	}

	public static <T extends Comparable<T>> T findMaxGenric(T elements[]) {
		T max = null;
		int n = elements.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if ((elements[j].compareTo(elements[j + 1])) > 0) {
					T temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
		printMaxGeneric(elements);
		return elements[n - 1];
	}

	public static <T extends Comparable<T>> T findMaxGenricTest(T... elementsTest) {
		T max = null;
		int n = elementsTest.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if ((elementsTest[j].compareTo(elementsTest[j + 1])) > 0) {
					T temp = elementsTest[j];
					elementsTest[j] = elementsTest[j + 1];
					elementsTest[j + 1] = temp;
				}
			}
		}
		return elementsTest[n - 1];
	}

	public static <T> void printMaxGeneric(T elements[]) {
		int n = elements.length;
		System.out.println("Sorted List of Elements : ");
		for (T a : elements) {
			System.out.println(a);
		}
		System.out.println("Max element in the list is : " + elements[n - 1]);
	}

	public static <T> void main(String Args[]) {
		MaxNumber<Integer> maxNumber = new MaxNumber(1000, 5, 9, 8, 7, 52, 63, 962, 2, 59, 5);
		MaxNumber<String> maxString = new MaxNumber("Apple", "Bannnaa", "Peacha", "Peach");
		maxString.maximumArray();
		maxNumber.maximumArray();
	}
}
