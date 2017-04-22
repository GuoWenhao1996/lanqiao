package com.gwh.sfxl.algo030;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[m][2];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[] tag = new int[t + 1];
		for (int i = 0; i < m; i++) {
			for (int j = t; j > 0; j--) {
				if (j >= arr[i][0]) {
					if (tag[j - arr[i][0]] + arr[i][1] > tag[j]) {
						tag[j] = tag[j - arr[i][0]] + arr[i][1];
					}
				} else {
					continue;
				}
			}
		}
		System.out.println(tag[t]);
	}
}