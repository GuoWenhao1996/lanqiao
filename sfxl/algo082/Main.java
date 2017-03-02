package com.gwh.sfxl.algo082;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int length = 2 * n - 1;
		char[][] map = new char[length][length];
		for (int i = 0; i < length; i++)
			for (int j = 0; j < length; j++)
				map[i][j] = '.';
		map[n - 1][n - 1] = (char) ('A' + n - 1);
		for (int i = 1; i < n; i++) {
			map[n - 1 - i][n - 1 - i] = (char) ('A' + n - 1 - i);
			map[n - 1 - i][n - 1] = (char) ('A' + n - 1 - i);
			map[n - 1 - i][n - 1 + i] = (char) ('A' + n - 1 - i);
			map[n - 1][n - 1 - i] = (char) ('A' + n - 1 - i);
			map[n - 1][n - 1 + i] = (char) ('A' + n - 1 - i);
			map[n - 1 + i][n - 1 - i] = (char) ('A' + n - 1 - i);
			map[n - 1 + i][n - 1] = (char) ('A' + n - 1 - i);
			map[n - 1 + i][n - 1 + i] = (char) ('A' + n - 1 - i);
		}
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++)
				System.out.print(map[i][j]);
			System.out.println();
		}
	}
}
