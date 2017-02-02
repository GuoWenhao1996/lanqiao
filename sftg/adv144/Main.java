package com.gwh.sftg.adv144;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] wupin = new int[n][2];
		for (int i = 0; i < n; i++) {
			wupin[i][0] = sc.nextInt();// 重量
			wupin[i][1] = sc.nextInt();// 价值
		}
	}
}
