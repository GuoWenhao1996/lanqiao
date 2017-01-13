package com.gwh.rmxl.begin4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long fb1 = 1;
		long fb2 = 1;
		long fb = 1;
		for (int i = 1; i <= n - 2; i++) {
			// 在此处存储余数，防止越界
			fb = (long) (fb1 + fb2) % 10007;
			fb2 = (long) fb1;
			fb1 = (long) fb;
		}
		System.out.println(fb);
	}
}
