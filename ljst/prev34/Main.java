package com.gwh.ljst.prev34;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		n++;// 行+1
		m++;// 列+1
		boolean[][] coins = new boolean[n][m];
		for (int i = 1; i < n; i++)
			for (int j = 1; j < m; j++) {
				Qcoin(coins, i, j, n, m);
				if (coins[i][j] == true)
					count++;
			}
		System.out.println(count);
	}

	private static void Qcoin(boolean[][] array, int x, int y, int n, int m) {
		for (int i = 1; i * x < n; i++) {
			for (int j = 1; j * y < m; j++) {
				array[i * x][j * y] = !array[i * x][j * y];
			}
		}
	}
}
