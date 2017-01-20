package com.gwh.jclx.basic17;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[][] matrix = new long[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				matrix[i][j] = sc.nextInt();
		if (M == 0)
			for (int i = 0; i < N; i++)
				for (int j = 0; j < N; j++) {
					if (i == j)
						matrix[i][j] = 1;
					else
						matrix[i][j] = 0;
				}
		else
			matrix = powMatrix(matrix, M);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
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
		return sum;
	}
}
