package com.gwh.sfxl.algo016;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int R = scanner.nextInt();
		char[] c = "0123456789ABCDEFG".toCharArray();
		String s1 = N + "=";
		String s = "";
		while (N != 0) {
			int t = N % R;
			if (t < 0) {
				t = t - R;
				N = N / R + 1;
			} else
				N = N / R;
			s = c[t] + s;
		}
		System.out.println(s1 + s + "(base" + R + ")");
	}
}
