package com.gwh.jclx.basic25;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] num = new int[m][n];
		boolean[][] zt = new boolean[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				num[i][j] = sc.nextInt();
			}
		int indexi = 0;
		int indexj = 0;
		int fangxiang = 1;
		int step = m * n;
		while (step > 0) {
			if (indexi > m - 1 || indexi < 0 || indexj > n - 1 || indexj < 0 || zt[indexi][indexj]) {
				if (fangxiang == 1) {
					fangxiang++;
					indexi--;
					indexj++;
				} else if (fangxiang == 2) {
					fangxiang++;
					indexi--;
					indexj--;
				} else if (fangxiang == 3) {
					fangxiang++;
					indexi++;
					indexj--;
				} else if (fangxiang == 4) {
					fangxiang = 1;
					indexi++;
					indexj++;
				}
			} else {
				System.out.print(num[indexi][indexj] + " ");
				zt[indexi][indexj] = true;
				step--;
				if (fangxiang == 1)
					indexi++;
				else if (fangxiang == 2)
					indexj++;
				else if (fangxiang == 3)
					indexi--;
				else if (fangxiang == 4)
					indexj--;
			}
		}
	}
}
