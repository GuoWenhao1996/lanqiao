package com.gwh.ljst.prev33;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] map = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				map[i][j] = sc.nextInt();
		int posi = sc.nextInt();
		int posj = sc.nextInt();
		String fxstr = sc.next();
		char fx = fxstr.charAt(0);
		int step = sc.nextInt();

		for (int i = 0; i < step; i++) {
			if (map[posi][posj] == 0) {
				map[posi][posj] = 1;
				if (fx == 'L') {
					fx = 'D';
					posi++;
				} else if (fx == 'D') {
					fx = 'R';
					posj++;
				} else if (fx == 'R') {
					fx = 'U';
					posi--;
				} else {
					fx = 'L';
					posj--;
				}
			} else {
				map[posi][posj] = 0;
				if (fx == 'R') {
					fx = 'D';
					posi++;
				} else if (fx == 'U') {
					fx = 'R';
					posj++;
				} else if (fx == 'L') {
					fx = 'U';
					posi--;
				} else {
					fx = 'L';
					posj--;
				}
			}
		}
		System.out.println(posi + " " + posj);
	}
}
