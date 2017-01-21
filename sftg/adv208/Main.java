package com.gwh.sftg.adv208;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ai = sc.nextInt();
		int aj = sc.nextInt();
		long[][] matrix1 = new long[ai][aj];
		for (int i = 0; i < ai; i++)
			for (int j = 0; j < aj; j++)
				matrix1[i][j] = sc.nextLong();
		int bi = sc.nextInt();
		int bj = sc.nextInt();
		long[][] matrix2 = new long[bi][bj];
		for (int i = 0; i < bi; i++)
			for (int j = 0; j < bj; j++)
				matrix2[i][j] = sc.nextLong();
		long[][] matrix0 = new long[ai][bj];
		matrix0 = mulMatrix(matrix1, ai, matrix2, bj);
		for (int i = 0; i < ai; i++) {
			for (int j = 0; j < bj; j++)
				System.out.print(matrix0[i][j] + " ");
			System.out.println();
		}
	}

	private static long[][] mulMatrix(long[][] matrix1, int ai, long[][] matrix2, int bj) {
		long matrix0[][] = new long[ai][bj];
		for (int i = 0; i < ai; i++)
			for (int j = 0; j < bj; j++)
				matrix0[i][j] = sumMatrix(matrix1, matrix2, i, j);
		return matrix0;
	}

	private static long sumMatrix(long[][] matrix1, long[][] matrix2, int i, int j) {
		long sum = 0;
		for (int k = 0; k < matrix2.length; k++)
			sum = sum + matrix1[i][k] * matrix2[k][j];
		return sum;
	}
}
