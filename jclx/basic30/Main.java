package com.gwh.jclx.basic30;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[10000];
		num[num.length - 1] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = num.length - 1; j >= 0; j--) {
				num[j] = num[j] * i;
			}
			for (int j = num.length - 1; j >= 0; j--) {
				if (num[j] > 9) {
					num[j - 1] = num[j - 1] + num[j] / 10;
					num[j] = num[j] % 10;
				}
			}
		}
		boolean start = false;
		if (num[0] > 0)
			start = true;
		for (int i = 0; i < num.length; i++) {
			if (start)
				System.out.print(num[i]);
			else {
				if (num[i] == 0)
					continue;
				else {
					start = true;
					System.out.print(num[i]);
				}
			}
		}
	}
}
