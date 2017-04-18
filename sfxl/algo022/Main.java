package com.gwh.sfxl.algo022;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int f[][] = new int[250][10];
		for (int i = 0; i <= n; i++) {
			f[i][1] = 1;
		}
		for (int i = 2; i <= k; i++) {
			for (int j = 0; j <= n - k; j++) {
				if (i > j) {
					f[j][i] = f[j][i - 1];
				} else {
					f[j][i] = f[j][i - 1] + f[j - i][i];
				}
			}
		}
		System.out.println(f[n - k][k]);
	}
}
