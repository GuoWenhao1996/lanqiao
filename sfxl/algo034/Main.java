package com.gwh.sfxl.algo034;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int a[] = new int[30001];

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 1; i < 30001; i++)
			a[i] = 999999;
		int k = n;
		int sum = 0;
		for (int i = 1; i <= n; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		oter: for (int i = 1; i <= n; i++) {
			for (int j = n; j > 0; j--) {
				if (k == i) {
					sum++;
					break oter;
				}
				if (k - i == 1 && a[i] + a[k] > w) {
					sum += 2;
					break oter;
				}
				if (k - i == 1 && a[i] + a[k] <= w) {
					sum++;
					break oter;
				}
				if (a[i] + a[k] > w) {
					k--;
					sum++;
				} else {
					sum++;
					k--;
					break;
				}
			}
		}
		System.out.println(sum);
	}
}
