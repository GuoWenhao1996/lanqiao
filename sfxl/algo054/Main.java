package com.gwh.sfxl.algo054;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			String str = sum + "";
			int i1 = i;
			int i2 = i + 1;
			int i3 = i + 2;
			sum = i1 + i2 + i3;
			for (int j = 0; j < str.length(); j++) {
				if (sum % 10 == i1 % 10 + i2 % 10 + i3 % 10) {
					sum = sum / 10;
					i1 = i1 / 10;
					i2 = i2 / 10;
					i3 = i3 / 10;
					if (j < str.length() - 1)
						continue;
					else
						count++;
				} else {
					break;
				}
			}
		}
		System.out.println(count);
	}
}
