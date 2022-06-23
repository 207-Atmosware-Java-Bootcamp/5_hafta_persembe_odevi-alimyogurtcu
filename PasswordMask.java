package com.turkcell.Odevler;

import java.util.Scanner;

public class PasswordMask {
	public static void main(String[] args) {
		maskPassword();
	}
	
	public static void maskPassword() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sifre giriniz: ");
		String enterPassword = scanner.next();
		String maskPassword = "";
		for (int i = 0; i < enterPassword.length(); i++) {
			if (i != 0 && i != enterPassword.length() - 1)
				maskPassword += "*";
			else
				maskPassword += enterPassword.charAt(i);
		}
		System.out.println("\nSifre " + enterPassword + "\nGizlenmis " + maskPassword);
	}
}
