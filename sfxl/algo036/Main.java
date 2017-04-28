package com.gwh.sfxl.algo036;

import java.util.Scanner;

public class Main {
	static int[][][] dp = new int[105][55][55];
	static int[][] map = new int[100][100];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int c = n + m - 2;
		for (int k = 1; k < c; k++) {
			int t = k + 2 > n ? n : k + 2;
			for (int i = 1; i <= t; i++) {
				for (int x = i + 1; x <= t; x++) {
					dp[k][i][x] = Math.max(Math.max(dp[k - 1][i - 1][x], dp[k - 1][i][x - 1]),
							Math.max(dp[k - 1][i - 1][x - 1], dp[k - 1][i][x])) + map[i][k + 2 - i] + map[x][k + 2 - x];
				}
			}
		}
		dp[c][n][n] = Math.max(dp[c - 1][n - 1][n], dp[c - 1][n][n - 1]);
		System.out.println(dp[c][n][n]);
	}
}
