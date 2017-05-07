package com.gwh.sfxl.algo060;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCankao {
	static int m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int b = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);

		int[][] arr = new int[2][2];
		for (int i = 0; i < arr.length; i++) {
			String[] tag = br.readLine().split(" ");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(tag[j]);
			}
		}

		int[][] tak = new int[2][2];
		tak = mulpow(arr, b);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(tak[i][j] % m + " ");
			}
			System.out.println();
		}

	}

	public static int[][] mul(int[][] x, int[][] y) {
		int[][] temp = new int[2][2];
		for (int a = 0; a < 2; a++) {
			for (int b = 0; b < 2; b++) {
				temp[a][b] = 0;
				for (int c = 0; c < 2; c++) {
					temp[a][b] += x[a][c] * y[c][b];
					temp[a][b] %= m;
				}
			}
		}

		return temp;
	}

	public static int[][] mulpow(int[][] arr, int b) {
		if (b == 0) {
			int[][] temp = new int[2][2];
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					if (x == y)
						temp[x][y] = 1;
				}
			}
			return temp;
		}
		if (b == 1)
			return arr;
		int[][] rep = mulpow(arr, b / 2);
		if (b % 2 == 0)
			return mul(rep, rep);
		else
			return mul(mul(rep, rep), arr);
	}
}
