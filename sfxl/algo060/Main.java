package com.gwh.sfxl.algo060;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int m = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int b = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		long[][] matrix = new long[2][2];
		for (int i = 0; i < 2; i++) {
			String[] tag = br.readLine().split(" ");
			for (int j = 0; j < 2; j++)
				matrix[i][j] = Integer.parseInt(tag[j]);
		}
		if (b == 0)
			for (int i = 0; i < 2; i++)
				for (int j = 0; j < 2; j++) {
					if (i == j)
						matrix[i][j] = 1;
					else
						matrix[i][j] = 0;
				}
		else
			matrix = powMatrix(matrix, b);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}

	private static long[][] powMatrix(long[][] matrix, int m) {
		long matrix0[][] = matrix;
		for (int i = 1; i < m; i++) {
			matrix = mulMatrix(matrix, matrix0);
		}
		return matrix;
	}

	private static long[][] mulMatrix(long[][] matrix1, long[][] matrix2) {
		long matrix0[][] = new long[matrix1.length][matrix1.length];
		for (int i = 0; i < matrix1.length; i++)
			for (int j = 0; j < matrix1.length; j++)
				matrix0[i][j] = sumMatrix(matrix1, matrix2, i, j);
		return matrix0;
	}

	private static long sumMatrix(long[][] matrix1, long[][] matrix2, int i, int j) {
		long sum = 0;
		for (int k = 0; k < matrix1.length; k++)
			sum = sum + matrix1[i][k] * matrix2[k][j];
		return sum % m;
	}
}
