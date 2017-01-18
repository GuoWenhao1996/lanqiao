package com.gwh.ljst.prev34;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] coins = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				coins[i][j] = 1;// 1代表正面，-1代表反面
				System.out.print(coins[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				Qcoin(coins, i + 1, j + 1, n, m);
				System.out.print(coins[i][j]);
			}
			System.out.println();
		}
	}

	private static void Qcoin(int[][] array, int x, int y, int n, int m) {
		for (int i = 0; i * x < n; i++) {
			for (int j = 0; j * y < m; j++) {
				array[i * x][j * y] = -array[i * x][j * y];
			}
		}
	}
}
