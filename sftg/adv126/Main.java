package com.gwh.sftg.adv126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int game = 0;
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			char[][] map = new char[n][m];
			if (n == 0 && m == 0)
				break;
			else {
				game++;
			}
			for (int i = 0; i < n; i++) {
				String input = sc.next();
				for (int j = 0; j < m; j++) {
					map[i][j] = input.charAt(j);
				}
			}
			System.out.println("Field #" + game + ":");
			int[][] count = new int[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++) {
					if (map[i][j] == '*') {
						count[i][j] = -1;
						try {
							if (count[i - 1][j - 1] != -1)
								count[i - 1][j - 1]++;
						} catch (Exception e) {
						}
						try {
							if (count[i - 1][j] != -1)
								count[i - 1][j]++;
						} catch (Exception e) {
						}
						try {
							if (count[i - 1][j + 1] != -1)
								count[i - 1][j + 1]++;
						} catch (Exception e) {
						}
						try {
							if (count[i][j - 1] != -1)
								count[i][j - 1]++;
						} catch (Exception e) {
						}
						try {
							if (count[i][j + 1] != -1)
								count[i][j + 1]++;
						} catch (Exception e) {
						}
						try {
							if (count[i + 1][j - 1] != -1)

								count[i + 1][j - 1]++;
						} catch (Exception e) {
						}
						try {
							if (count[i + 1][j] != -1)
								count[i + 1][j]++;
						} catch (Exception e) {
						}
						try {
							if (count[i + 1][j + 1] != -1)
								count[i + 1][j + 1]++;
						} catch (Exception e) {
						}
					}
				}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (count[i][j] == -1)
						System.out.print("*");
					else
						System.out.print(count[i][j]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
