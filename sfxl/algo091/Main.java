package com.gwh.sfxl.algo091;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if (str1.length() == str2.length()) {
			char[] ch1 = str1.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for (int i = 0; i < str1.length(); i++) {
				if (ch1[i] != ch2[i]) {
					System.out.println("N");
					System.exit(0);
				}
			}
			System.out.println("Y");
		} else
			System.out.println("N");
	}
}
