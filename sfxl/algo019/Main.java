package com.gwh.sfxl.algo019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int x;
	static int y;
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		int[][] tag = new int[2 * n + 1][2 * n + 1];
		int[][] arr = new int[n * n][2];
		out: for (int i = 1;; i++) {
			String[] str = br.readLine().split(" ");
			for (int j = 0; j < 1; j++) {
				x = arr[i][0] = Integer.parseInt(str[0]);
				y = arr[i][1] = Integer.parseInt(str[1]);
				tag[x][y] = Integer.parseInt(str[2]);
				if (x == 0 && y == 0 && tag[x][y] == 0) {
					dp(tag);
					break out;
				}
			}
		}
	}

	public static void dp(int[][] tag) {
		int[][] temp = new int[2 * n][2 * n];
		int k;
		for (int i = 2; i <= 2 * n; i++) {
			for (int t = min(i, n), j = t; j > 0; j--) {
				for (k = t; k > 0; k--) {
					temp[j][k] = max(temp[j][k], temp[j - 1][k - 1]);
					temp[j][k] = max(temp[j][k], temp[j - 1][k]);
					temp[j][k] = max(temp[j][k], temp[j][k - 1]);
					if (j == k)
						temp[j][k] += tag[j][i - j];
					else
						temp[j][k] += tag[j][i - j] + tag[k][i - k];
				}
			}
		}
		System.out.println(temp[n][n]);
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static int min(int a, int b) {
		return a > b ? b : a;
	}
}
