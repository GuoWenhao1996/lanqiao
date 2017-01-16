package com.gwh.sfxl.algo154;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] array = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				array[i][j] = sc.nextInt();
				sum = sum + array[i][j];
			}
		System.out.println(sum);
	}
}
