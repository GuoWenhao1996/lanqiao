package com.gwh.sfxl.algo021;

import java.util.Scanner;

public class Main {
	private static int box[][] = new int[31][20001];

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int n = sc.nextInt();
		int wupin[] = new int[n + 1];
		for (int i = 1; i <= n; i++)
			wupin[i] = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= v; j++) {
				if (j < wupin[i])
					box[i][j] = box[i - 1][j];
				else
					box[i][j] = Math.max(box[i - 1][j], box[i - 1][j - wupin[i]] + wupin[i]);
			}
		}
		System.out.println(v - box[n][v]);
	}
}
