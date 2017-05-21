package com.gwh.sfxl.algo078;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		for (int i = 0; i < in.length(); i++) {
			if (in.charAt(i) == 'a' || in.charAt(i) == 'e' || in.charAt(i) == 'i' || in.charAt(i) == 'o'
					|| in.charAt(i) == 'u') {
				System.out.println(i + 1);
				return;
			}
		}
		System.out.println(0);
	}
}
