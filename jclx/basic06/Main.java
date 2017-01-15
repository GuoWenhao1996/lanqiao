package com.gwh.jclx.basic06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		array[0][0] = 1;
		array[1][0] = 1;
		array[1][1] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					array[i][j] = 1;
				}
				if (i > 1 && j > 0) {
					array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
				}
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
