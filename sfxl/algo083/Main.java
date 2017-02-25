package com.gwh.sfxl.algo083;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		for (int i = 2; i <= n; i++) {
			num = num * i;
			while (true) {
				if (num % 10 == 0)
					num = num / 10;
				else {
					num = num % 10000000;
					break;
				}
			}
		}
		System.out.println(num%10);
	}
}
