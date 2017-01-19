package com.gwh.jclx.basic17;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] matrix = new int[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				matrix[i][j] = sc.nextInt();
		matrix = powMatrix(matrix, M);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}

	private static int[][] powMatrix(int[][] matrix, int m) {
		for (int i = 0; i < m; i++)
			matrix = mulMatrixSelf(matrix);
		return matrix;
	}

	private static int[][] mulMatrixSelf(int[][] matrix) {
		int matrix0[][] = new int[matrix.length][matrix.length];
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix.length; j++)
				matrix0[i][j] = sumMatrix(matrix, i, j);
		return matrix0;
	}

	private static int sumMatrix(int[][] matrix, int i, int j) {
		int sum = 0;
		for (int k = 0; k < matrix.length; k++)
			sum = matrix[i][k] + matrix[k][j];
		return sum;
	}
}
