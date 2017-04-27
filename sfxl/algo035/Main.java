package com.gwh.sfxl.algo035;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int dp[][] = new int[m + 1][n + 1];
		dp[0][0] = 1;
		for (int i = 1; i <= m; i++) {
			for (int j = 0; j < n; j++) {
				if ((j - 1) == -1)
					dp[i][j] = dp[i - 1][n - 1];
				else
					dp[i][j] = dp[i - 1][j - 1];
				if ((j + 1) == n)
					dp[i][j] = dp[i][j] + dp[i - 1][0];
				else
					dp[i][j] = dp[i][j] + dp[i - 1][j + 1];
			}
		}
		System.out.println(dp[m][0]);
	}
}
