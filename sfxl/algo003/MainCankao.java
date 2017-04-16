package com.gwh.sfxl.algo003;

import java.util.Scanner;

public class MainCankao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int L = sc.nextInt();
		int f[][] = new int[L][K];
		int i, j, k, sum = 0;
		for (j = 0; j < K; j++)
			f[0][j] = 1;
		f[0][0] = 0;
		if (L > 1) {
			for (i = 1; i < L; i++) {
				for (j = 0; j < K; j++) {
					for (k = 0; k < K; k++)
						if (k != j - 1 && k != j + 1) {
							f[i][j] += f[i - 1][k];
							f[i][j] %= 1000000007;
						}
				}
			}
		}
		for (j = 0; j < K; j++) {
			sum += f[L - 1][j];
			sum %= 1000000007;
		}
		System.out.println(sum);
	}
}
