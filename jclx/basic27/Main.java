package com.gwh.jclx.basic27;

import java.util.Scanner;

public class Main {
	static int[] bqueen = new int[1000];// 黑皇后
	static int[] wqueen = new int[1000];// 白皇后
	static int[][] chessboard = new int[1000][1000];// 1:能放 0:不能放
	static int count = 0;
	static int n = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int j;
		n = sc.nextInt();
		for (i = 0; i < n; i++)
			for (j = 0; j < n; j++)
				chessboard[i][j] = sc.nextInt();
		WhiteQueen(0);
		System.out.println(count);
	}

	static int BlackQueen(int k) {
		int i;
		int j;
		for (i = 0; i < k - 1; i++) {
			int judge = bqueen[i] - bqueen[k - 1];
			if (judge == 0 || Math.abs(judge) == Math.abs(k - 1 - i))
				return 0;
		}
		if (k == n) {
			count++;
			return 0;
		}
		for (j = 0; j < n; j++) {
			if (j != wqueen[k] && chessboard[k][j] == 1) {
				bqueen[k] = j;
				BlackQueen(k + 1);
			}
		}
		return 0;
	}

	static int WhiteQueen(int k) {
		int i;
		int j;
		for (i = 0; i < k - 1; i++) {
			int judge = wqueen[i] - wqueen[k - 1];
			if (judge == 0 || Math.abs(k - 1 - i) == Math.abs(judge))
				return 0;
		}
		if (k == n) {
			BlackQueen(0);
			return 0;
		}
		for (j = 0; j < n; j++) {
			if (chessboard[k][j] == 1) {
				wqueen[k] = j;
				WhiteQueen(k + 1);
			}
		}
		return 0;
	}
}
