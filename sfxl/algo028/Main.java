package com.gwh.sfxl.algo028;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[10001];
		int sum = 1;
		for (int i = 1; i <= n; i++)
			a[i] = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			sum = 1;
			for (int j = i; j > 1; j--)
				sum *= j;
			int c[] = new int[i + 1];
			for (int k = 0; k < i; k++)
				c[k] = a[n - i + k + 1];
			if (cantor(c, i, m, sum, n, a))
				return;
		}

	}

	public static boolean cantor(int a[], int n, int m, int sum, int y, int d[]) {
		int count = 1;
		for (int i = 0; i < n; i++) {
			int temp = 0;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[i])
					temp++;
			}
			int num = 1;
			for (int k = 2; k <= n - i - 1; k++) {
				num *= k;
			}
			count += num * temp;

		}
		if (count + m <= sum) {
			for (int i = 1; i <= y - n; i++)
				System.out.print(d[i] + " ");
			java.util.Arrays.sort(a);
			boolean b[] = new boolean[10001];
			int r = count + m - 1;
			sum = 1;
			int num = 0;
			for (int i = n; i >= 1; i--) {
				sum = 1;
				num = 0;
				for (int j = i - 1; j >= 1; j--)
					sum *= j;
				int x = r / sum;
				r = r % sum;
				for (int k = 1; k <= n; k++) {
					if (!b[k])
						num++;
					if (num == x + 1) {
						System.out.print(a[k] + " ");
						b[k] = true;
						break;
					}
				}
			}
			return true;
		}
		return false;
	}
}
