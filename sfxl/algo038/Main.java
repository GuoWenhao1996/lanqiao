package com.gwh.sfxl.algo038;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] need = new int[n];
		int[][] info = new int[2][m];
		for (int i = 0; i < n; i++)
			need[i] = sc.nextInt();
		for (int i = 0; i < m; i++)
			info[0][i] = i;
		int time = 0;
		int waitting = m;
		boolean jieshu = false;
		while (!jieshu) {
			time++;
			for (int i = 0; i < m; i++) {
				if (info[1][i] != -1)
					info[1][i]++;
				if (info[1][i] == need[info[0][i]]) {
					info[1][i] = -1;
					if (waitting != 0) {
						info[1][i] = 0;
						info[0][i] = waitting;
						waitting++;
						if (waitting == n)
							waitting = 0;
					}
				}
			}
			for (int i = 0; i < m; i++) {
				if (info[1][i] != -1) {
					jieshu = false;
					break;
				} else
					jieshu = true;
			}
		}
		System.out.println(time);
	}
}
