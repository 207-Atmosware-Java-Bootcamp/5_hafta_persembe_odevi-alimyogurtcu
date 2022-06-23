package com.turkcell.Odevler;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		stringReverse();
	}
	
	public static void stringReverse() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kelime giriniz: ");
		String enterString = scanner.next();
		String reverseString = "";
		for (int i = enterString.length() - 1; i >= 0; i--) {
			reverseString += enterString.charAt(i);
		}
		System.out.println("\nKelime " + enterString + "\nTersi " + reverseString + "\nKelime " + enterString.length()
				+ " harfli");
	}
}
