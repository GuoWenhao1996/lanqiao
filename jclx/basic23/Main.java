package com.gwh.jclx.basic23;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] num = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				num[i][j] = sc.nextInt();
		int indexi = 0;
		int indexj = 0;
		int m0 = -1;
		int n0 = -1;
		int fangxiang = 1;
		while (true) {
			if (indexi > m0 && indexj > n0 && indexi < m && indexj < n)
				System.out.print(num[indexi][indexj] + " ");
			else
				break;
			if (fangxiang == 1) {
				indexi++;
				if (indexi == m) {
					indexi--;
					indexj++;
					fangxiang++;
					m--;
				}
			} else if (fangxiang == 2) {
				indexj++;
				if (indexj == n) {
					indexj--;
					indexi--;
					fangxiang++;
					n--;
				}
			} else if (fangxiang == 3) {
				indexi--;
				if (indexi == m0) {
					indexi++;
					indexj--;
					fangxiang++;
					m0++;
				}
			} else if (fangxiang == 4) {
				indexj--;
				if (indexj == n0) {
					indexj++;
					indexi++;
					fangxiang = 1;
					n0++;
				}
			}
		}
	}
}
