package com.wissen.loopingstatements;

public class ForEach {

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 5, 5, 7, 8 };

		for (int result : intArray) {
			// System.out.println("Value ::"+result);

			if (result % 2 == 0) {
				System.out.println("even Number :: " + result);
			} else {
				System.out.println("odd Number :: " + result);
			}

		}

	}

}
