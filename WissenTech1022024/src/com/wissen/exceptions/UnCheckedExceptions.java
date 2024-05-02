package com.wissen.exceptions;

public class UnCheckedExceptions {

	public void generateNullPointerException() {
		String empName = "Kesava";
		String qualification = null;
		int salary = 10000;
		try {
			if (qualification.equals("Btech")) {
				salary += 10000;
			}

		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	public void numberFormatException() {
		String str = "123456";
		// int res= Integer.parseInt(str);
		
		 if (str.matches(".*\\d.*")) {
			 int res = Integer.valueOf(str);
			 System.out.println(res);
		 }
		
			/*
			 * try { int res = Integer.valueOf(str); System.out.println(res); } catch
			 * (Exception e) { e.printStackTrace(); }
			 */
		System.out.println("End of line 31");

	}

	public void generateArrayIndexOutOfBoundException() {
		int[] intArray = { 10, 100, 1000, 10000 };

		try {
			System.out.println(intArray[4]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End of ArrayIndexOutOfBoundException");
	}

	public static void generateArthamaticEception(int i, int j) {
		try {
			System.out.println(i / j);
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("End of ArthamaticEception");
	}

	public static void main(String[] args) {
		UnCheckedExceptions uc = new UnCheckedExceptions();
		// uc.generateNullPointerException();
		 uc.numberFormatException();
		// uc.generateArrayIndexOutOfBoundException();

		// UnCheckedExceptions.generateArthamaticEception(100,0);

	}

}
