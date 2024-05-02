package com.wissen.loopingstatements;

public class WhileLoop {

	public static void main(String[] args) {

		int i = 0;
		while (i <= 10) {
			//System.out.println(i);
			if (i % 2 == 0) {
				System.out.println("Even number ::" + i);
			} else {
				System.out.println("odd number ::" + i);
			}

			i++;
		}

		System.out.println("End While Loop");

	}

}
