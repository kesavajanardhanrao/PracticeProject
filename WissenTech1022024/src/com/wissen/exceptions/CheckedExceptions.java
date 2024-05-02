package com.wissen.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class CheckedExceptions {

	// Sql Exception

	public void generateFilenotFound() {
		// File not found
		File file = new File("D:\\Sample.txt");
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Java");
		System.out.println("Full Stack");

	}

	// ClassNotFoundException
	public void generateClassNotFOundException() {
		try {
			System.out.println(Class.forName("com.wissen.exceptions.CheckedExceptions"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//// Unsupported Encoding Exception

	public static void generateUnsupportedEncodingException() {
		String str = "WissenTech";
		try {
			byte[] byteArray = str.getBytes("UTF-16");//
			System.out.println(byteArray);
			System.out.println(byteArray[100]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End of programm");

	}

	public static void main(String[] args) {

		CheckedExceptions ce = new CheckedExceptions();
		ce.generateFilenotFound();
		ce.generateClassNotFOundException();
		CheckedExceptions.generateUnsupportedEncodingException();
	}

	// Class Not Found

}
