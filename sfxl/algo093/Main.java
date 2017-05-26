package com.gwh.sfxl.algo093;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a = reverse(a);
		b = reverse(b);
		System.out.println(reverse(a + b));
	}

	private static int reverse(int a) {
		int sum = 0;
		while (a > 0) {
			sum = sum * 10 + a % 10;
			a = a / 10;
		}
		return sum;
	}
}
