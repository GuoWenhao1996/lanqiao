package com.gwh.sfxl.algo150;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int num1 = 1;
		int num2 = 1;
		for (int i = 0; i < k; i++) {
			num1 = num1 * (n - i);
			num2 = num2 * (i + 1);
		}
		System.out.println(num1 / num2);
	}
}
