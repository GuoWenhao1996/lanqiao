package com.gwh.sftg.adv131;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int pos = 0;
		for (int i = 0; i < n; i++) {
			pos = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[pos])
					pos = j;
			}
			if (pos != i) {
				int temp = a[pos];
				a[pos] = a[i];
				a[i] = temp;
			}
			System.out.print("swap(a[" + i + "], a[" + pos + "]):");
			for (int j = 0; j < n; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
	}
}
